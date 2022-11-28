/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import entities.Admin;
import entities.Client;
import entities.User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import service.AdminService;
import service.ClientService;
import service.PasswordService;
import service.UserService;

/**
 * @author user
 */
@WebServlet(name = "SignUpController", urlPatterns = {"/signup"})
public class SignUpController extends HttpServlet {

    private ClientService cs = new ClientService();
    private UserService us = new UserService();

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");

        User user = us.findByEmail(email);
        System.out.println(user);
        if (user == null) {
            String password = request.getParameter("password"),
                    confirm = request.getParameter("confirm"),
                    nom = request.getParameter("nom"),
                    prenom = request.getParameter("prenom"),
                    tel = request.getParameter("tel"),
                    adresse = request.getParameter("address");
            System.out.println(confirm);
            if (password.equals(confirm)) {
                cs.create(new Client(nom, prenom, tel, adresse, email, PasswordService.hash(password)));
            }
            response.sendRedirect("client/connexion.html");
        } else {
            response.sendRedirect("client/connexion.html");
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
