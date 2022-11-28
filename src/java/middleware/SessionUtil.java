package middleware;

import entities.Client;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author user
 */
public class SessionUtil {

    public static boolean isLoggedIn(HttpServletRequest request, HttpServletResponse response) throws IOException {
        boolean b = request.getSession().getAttribute("user-o") != null;
        if (b) {
            response.sendRedirect("client/connexion.html");
        }
        return b;
    }

    public static boolean isClient(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return request.getSession().getAttribute("user-o") instanceof Client;

    }

    public static boolean hasCart(HttpServletRequest request, HttpServletResponse response) throws IOException {
        boolean b = request.getSession().getAttribute("cart") != null;
        return b;
    }

}
