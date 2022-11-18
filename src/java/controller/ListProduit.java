/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import entities.Categorie;
import entities.Marque;
import entities.Produit;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.CategorieService;
import service.MarqueService;
import service.ProduitService;

/**
 *
 * @author user
 */
@WebServlet(name = "ListProduit", urlPatterns = {"/produit"})
public class ListProduit extends HttpServlet {
    
    private ProduitService ps = new ProduitService();
    private CategorieService cs = new CategorieService();
    private MarqueService ms = new MarqueService();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Gson gson = new Gson();
        response.getWriter().write(gson.toJson(ss.findAll()));
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("nom"),
                designation = request.getParameter("designation"),
                image = request.getParameter("image"),
                description = request.getParameter("description");
        double prix = Double.parseDouble(request.getParameter("prix"));
        int unite = Integer.parseInt(request.getParameter("unite"));
        Categorie categorie = cs.findById(Integer.parseInt(request.getParameter("categorie")));
        Marque marque = ms.findById(Integer.parseInt(request.getParameter("marque")));
        
        ps.create(new Produit(nom, designation, image, description, prix, unite, categorie, marque));
        this.doGet(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
}
