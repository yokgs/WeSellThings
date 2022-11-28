/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import dto.ProduitDTO;
import entities.Categorie;
import entities.Marque;
import entities.Produit;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import service.CategorieService;
import service.MarqueService;
import service.ProduitService;

/**
 * @author user
 */
@WebServlet(name = "ListProduit", urlPatterns = {"/produit"})
public class ListProduit extends HttpServlet {

    private final ProduitService ps = new ProduitService();
    private final CategorieService cs = new CategorieService();
    private final MarqueService ms = new MarqueService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        Gson gson = new Gson();
        List<ProduitDTO> pdto = new ArrayList<>();
        ps.findAll().forEach(x -> {
            pdto.add(new ProduitDTO(x));
        });
        response.getWriter().write(gson.toJson(pdto));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String nom = request.getParameter("nom"),
                    designation = request.getParameter("designation"),
                    description = request.getParameter("description");
            System.out.println(request.getParameter("prix"));
            double prix = Double.parseDouble(request.getParameter("prix"));
            int unite = Integer.parseInt(request.getParameter("unite"));

            InputStream inputStream = null; // input stream of the upload file
            byte[] image = new byte[0];
            // obtains the upload file part in this multipart request
            Part filePart = request.getPart("image");
            if (filePart != null) {
                // prints out some information for debugging
                System.out.println(filePart.getName());
                System.out.println(filePart.getSize());
                System.out.println(filePart.getContentType());

                // obtains input stream of the upload file
                image = new byte[(int) filePart.getSize()];
                inputStream = filePart.getInputStream();
                inputStream.read(image);
            }

            Categorie categorie = cs.findById(Integer.parseInt(request.getParameter("categorie")));
            Marque marque = ms.findById(Integer.parseInt(request.getParameter("marque")));

            ps.create(new Produit(nom, designation, image, description, prix, unite, categorie, marque));
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        this.doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
