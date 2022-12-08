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
import java.io.File;

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
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import service.CategorieService;
import service.MarqueService;
import service.ProduitService;

/**
 * @author user
 */
@WebServlet(name = "ListProduit", urlPatterns = {"/produit"})
public class ListProduit extends HttpServlet {

    private String UPLOAD_DIRECTORY;
    private final ProduitService ps = new ProduitService();
    private final CategorieService cs = new CategorieService();
    private final MarqueService ms = new MarqueService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        String categorie = request.getParameter("categorie");
        List<Produit> produits;
        if (categorie != null) {
            int category = Integer.parseInt(categorie);
            produits = cs.findById(category).getProduits();
        } else {
            produits = ps.findAll();
        }

        Gson gson = new Gson();
        List<ProduitDTO> pdto = new ArrayList<>();
        produits.forEach(x -> {
            pdto.add(new ProduitDTO(x));
        });
        response.getWriter().write(gson.toJson(pdto));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UPLOAD_DIRECTORY = getServletContext().getRealPath("/").replace("build\\", "") + "ressource" + File.separator + "images";
        //process only if its multipart content
        System.out.println("rrrrrrrrrrrrrrrrrrrrr"+UPLOAD_DIRECTORY);
        if (ServletFileUpload.isMultipartContent(request)) {
            String path = "", nom = "", designation = "", description = "";
            double prix = 0;
            int unite = 0;
            Categorie categorie = null;
            Marque marque = null;
            try {
                List<FileItem> multiparts = new ServletFileUpload(
                        new DiskFileItemFactory()).parseRequest((RequestContext) request);
                String image = null;
                for (FileItem item : multiparts) {
                    if (!item.isFormField()) {
                        image = new File(item.getName()).getName();
                        item.write(new File(UPLOAD_DIRECTORY + File.separator + image));
                        path = UPLOAD_DIRECTORY + File.separator + image;
                    } else {
                        InputStream input = item.getInputStream();
                        if (item.getFieldName().equals("nom")) {
                            byte[] str = new byte[input.available()];
                            input.read(str);
                            nom = new String(str, "UTF8");
                        }
                        if (item.getFieldName().equals("designation")) {
                            byte[] str = new byte[input.available()];
                            input.read(str);
                            designation = new String(str, "UTF8");
                        }
                        if (item.getFieldName().equals("prix")) {
                            byte[] str = new byte[input.available()];
                            input.read(str);
                            //prix = Double.parseDouble(new String(str, "UTF8"));
                        }
                        if (item.getFieldName().equals("unite")) {
                            byte[] str = new byte[input.available()];
                            input.read(str);
                            unite = Integer.parseInt(new String(str, "UTF8"));
                        }
                        if (item.getFieldName().equals("categorie")) {
                            byte[] str = new byte[input.available()];
                            input.read(str);
                            categorie = cs.findById(Integer.parseInt(new String(str, "UTF8")));
                        }
                        if (item.getFieldName().equals("marque")) {
                            byte[] str = new byte[input.available()];
                            input.read(str);
                            marque = ms.findById(Integer.parseInt(new String(str, "UTF8")));
                        }
                        if (item.getFieldName().equals("description")) {
                            byte[] str = new byte[input.available()];
                            input.read(str);
                            description = new String(str, "UTF8");
                        }
                        System.out.println(prix);
                    }
                }
                //File uploaded successfully
                boolean pp = ps.create(new Produit(nom, designation, image, description, prix, unite, categorie, marque));
                request.setAttribute("message", "File Uploaded Successfully le nom est :" + nom + " la designation est :" + designation);
                System.out.println(pp);
                response.sendRedirect("/admin/ajouterProduit.html");
            } catch (Exception ex) {
                request.setAttribute("message", "File Upload Failed due to " + ex);
                response.sendRedirect("/admin/produits.html");
                ex.printStackTrace();
            }
        } else {
            request.setAttribute("message",
                    "Sorry this Servlet only handles file upload request");
            response.sendRedirect("/admin/clients.html");
        }

        response.sendRedirect("/admin/ajouterProduit.html");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
