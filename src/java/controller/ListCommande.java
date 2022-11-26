/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import dto.CommandeDTO;
import dto.MarqueDTO;
import entities.Client;
import entities.Marque;
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
import service.ClientService;
import service.CommandeService;
import service.MarqueService;

/**
 *
 * @author yazid slila
 */
@WebServlet(name = "ListCommande", urlPatterns = {"/commande"})
public class ListCommande extends HttpServlet {

        private CommandeService cs = new CommandeService();
        private ClientService cls = new ClientService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        Gson gson = new Gson();
        List<CommandeDTO> mdto = new ArrayList<>();
        cs.findAll().forEach(x -> {
            mdto.add(new CommandeDTO(x));
        });
        response.getWriter().write(gson.toJson(mdto));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Date now = new Date();
        HttpSession session = request.getSession();
                
        Client client = cls.findById(((User)session.getAttribute("user-o")).getId());
        
        String nom = request.getParameter("nom");
        

        this.doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
}
