/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import dto.MarqueDTO;
import dto.ProduitDTO;
import entities.Marque;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.MarqueService;

/**
 *
 * @author user
 */
@WebServlet(name = "ListMarque", urlPatterns = {"/marque"})
public class ListMarque extends HttpServlet {

    private MarqueService ms = new MarqueService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Gson gson = new Gson();
        List<MarqueDTO> mdto = new ArrayList<>();
        ms.findAll().forEach(x -> {
            mdto.add(new MarqueDTO(x));
        });
        response.getWriter().write(gson.toJson(mdto));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("nom");

        ms.create(new Marque(nom));
        this.doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
