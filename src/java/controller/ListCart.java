/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import dto.CommandeDTO;
import entities.Commande;
import entities.LigneCommande;
import entities.Produit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CommandeService;
import service.ProduitService;

/**
 * @author user
 */
@WebServlet(name = "ListCart", urlPatterns = {"/cart"})
public class ListCart extends HttpServlet {

    private CommandeService cs = new CommandeService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            int id = Integer.parseInt(request.getParameter("id")),
                    quantite = Integer.parseInt(request.getParameter("quantite"));
            Produit produit = (new ProduitService()).findById(id);
            Commande commande = (Commande) request.getSession().getAttribute("cart");
            LigneCommande ligneCommande;
            boolean exist = false;
            for (LigneCommande lc : commande.getLigneCommandes()) {
                exist = exist || lc.getProduit().getId() == id;
                if (exist) {
                    lc.setQuantité(quantite + lc.getQuantité());
                    break;
                }
            }
            if (!exist) {
                ligneCommande = new LigneCommande(quantite * produit.getPrix(), quantite, produit, commande);
                commande.getLigneCommandes().add(ligneCommande);
            }
            request.getSession().setAttribute("cart", commande);

        } catch (NumberFormatException e) {

        }
        
        response.sendRedirect("/client/cart.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        Gson gson = new Gson();
        response.getWriter().write(gson.toJson(new CommandeDTO((Commande) request.getSession().getAttribute("cart"))));
        //this.doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
