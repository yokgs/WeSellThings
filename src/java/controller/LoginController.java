/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import entities.Admin;
import entities.Client;
import entities.Commande;
import entities.User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.AdminService;
import service.PasswordService;
import service.UserService;

/**
 * @author user
 */
@WebServlet(name = "LoginController", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {

    private UserService us = new UserService();
    private AdminService as = new AdminService();

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User user = null;

        String email = request.getParameter("email"),
                password = request.getParameter("password");

        user = us.findByEmail(email);
        if (user != null) {
            if (PasswordService.verify(password, user.getPassword())) {
                HttpSession session = request.getSession();
                session.setAttribute("user-o", user);
                session.setAttribute("user-r", as.findById(user.getId()) != null ? "admin" : "client");
                if (user instanceof Client) {
                    session.setAttribute("cart", new Commande((Client) user));
                    response.sendRedirect("./client/indexClient.jsp");
                } else {
                    response.sendRedirect("./admin/produits.html");
                }
            } else {
                response.sendRedirect("./client/connexion.html?incorrect password");
            }
        } else {
            response.sendRedirect("./client/connexion.html");
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
    }

}
