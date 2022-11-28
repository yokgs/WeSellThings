/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import dto.CategorieDTO;
import dto.ProduitDTO;
import entities.Categorie;
import entities.Marque;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CategorieService;
import service.MarqueService;

/**
 * @author user
 */
@WebServlet(name = "ListCategorie", urlPatterns = {"/categorie"})
public class ListCategorie extends HttpServlet {

    private CategorieService cs = new CategorieService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        Gson gson = new Gson();
        List<CategorieDTO> cdto = new ArrayList<>();
        cs.findAll().forEach(x -> {
            if (x != null) {
                cdto.add(new CategorieDTO(x));
            }
        });
        response.getWriter().write(gson.toJson(cdto));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("nom");
        int id;
        Categorie categorie = null;
        try {
            id = Integer.parseInt(request.getParameter("id"));
            categorie = cs.findById(id);
        } catch (NumberFormatException e) {
        }

        cs.create(new Categorie(nom, categorie));
        this.doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
