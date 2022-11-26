/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Commande;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.CommandeService;

/**
 *
 * @author yazid slila
 */
@WebServlet(name = "UpdateCommande", urlPatterns = {"/commande/update"})
public class UpdateCommande extends HttpServlet {

   
    private CommandeService cs = new CommandeService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Commande commande  = cs.findById(id);
        cs.delete(commande);
        response.sendRedirect("/commande");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("id");
        int id = Integer.parseInt(request.getParameter("id"));
        Commande commande= cs.findById(id);
        //commande.set(nom);
        cs.update(commande);
        response.sendRedirect("/commande");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
