/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import entities.Categorie;
import entities.Marque;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.CategorieService;
import service.MarqueService;

/**
 *
 * @author user
 */
@WebServlet(name = "ListCategorie", urlPatterns = {"/categorie"})
public class ListCategorie extends HttpServlet {
  private CategorieService cs = new CategorieService();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Gson gson = new Gson();
        response.getWriter().write(gson.toJson(cs.findAll()));
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("nom");
        
        int id = Integer.parseInt(request.getParameter("id"));
        Categorie categorie = cs.findById(id);
        cs.create(new Categorie(nom, categorie));
        this.doGet(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
