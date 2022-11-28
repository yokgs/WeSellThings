/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Produit;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ProduitService;

/**
 * @author yazid slila
 */
@WebServlet(name = "UpdateProduit", urlPatterns = {"/produit/update"})
public class UpdateProduit extends HttpServlet {

    private ProduitService ps = new ProduitService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Produit produit = ps.findById(id);
        ps.delete(produit);
        response.sendRedirect("/produit");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("id");
        int id = Integer.parseInt(request.getParameter("id"));
        Produit produit = ps.findById(id);
        produit.setNom(nom);
        ps.update(produit);
        response.sendRedirect("/produit");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
