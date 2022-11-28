/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import dto.MarqueDTO;
import entities.Marque;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MarqueService;

/**
 * @author yazid slila
 */
@WebServlet(name = "UpdateMarque", urlPatterns = {"/marque/update"})
public class UpdateMarque extends HttpServlet {

    private MarqueService ms = new MarqueService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Marque marque = ms.findById(id);
        ms.delete(marque);
        response.sendRedirect("/marque");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("id");
        int id = Integer.parseInt(request.getParameter("id"));
        Marque marque = ms.findById(id);
        marque.setNom(nom);
        ms.update(marque);
        response.sendRedirect("/marque");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
