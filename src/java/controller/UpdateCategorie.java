/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Categorie;
import entities.Marque;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.CategorieService;
import service.MarqueService;

/**
 *
 * @author yazid slila
 */
@WebServlet(name = "UpdateCategorie", urlPatterns = {"/categorie/update"})
public class UpdateCategorie extends HttpServlet {

   
    private CategorieService cs = new CategorieService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Categorie categorie = cs.findById(id);
        cs.delete(categorie);
        response.sendRedirect("/categorie");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("id");
        int id = Integer.parseInt(request.getParameter("id"));
        Categorie categorie = cs.findById(id);
        categorie.setNom(nom);
        cs.update(categorie);
        response.sendRedirect("/categorie");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
