/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import dto.CommandeDTO;
import entities.Client;
import entities.Commande;
import entities.CommandeEtat;
import entities.CommandeEtatConverter;
import entities.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import middleware.SessionUtil;
import service.ClientService;
import service.CommandeService;

/**
 *
 * @author user
 */
@WebServlet(name = "ListCommandeEtat", urlPatterns = {"/commande/etat"})
public class ListCommandeEtat extends HttpServlet {

    private CommandeService cs = new CommandeService();
    private ClientService cls = new ClientService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        int etat = Integer.parseInt(request.getParameter("etat"));
        CommandeEtat ce = (new CommandeEtatConverter()).convertToEntityAttribute(etat);
        Gson gson = new Gson();
        List<CommandeDTO> mdto = new ArrayList<>();
        if (!SessionUtil.isClient(request, response)) {
            cs.findByEtat(ce).forEach(x -> {
                mdto.add(new CommandeDTO(x));
            });
        }
        response.getWriter().write(gson.toJson(mdto));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int etat = Integer.parseInt(request.getParameter("etat"));
        CommandeEtat ce = (new CommandeEtatConverter()).convertToEntityAttribute(etat);
        int id = Integer.parseInt(request.getParameter("id"));
        Commande commande = cs.findById(id);
        commande.setEtat(ce);
        cs.update(commande);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
