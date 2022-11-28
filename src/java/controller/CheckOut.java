/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import entities.Client;
import entities.Commande;
import entities.LigneCommande;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import service.CommandeService;
import service.LigneCommandeService;

/**
 *
 * @author user
 */
@WebServlet(name = "CheckOut", urlPatterns = {"/cart/validate"})
public class CheckOut extends HttpServlet {
private CommandeService cs = new CommandeService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();
            Commande commande = (Commande) session.getAttribute("cart");
            commande.setDate(new Date());
            cs.create(commande);
            List<LigneCommande> lc = commande.getLigneCommandes();
            lc.forEach(x->(new LigneCommandeService()).create(x));
            session.setAttribute("cart", new Commande((Client) session.getAttribute("user-o")));
            response.sendRedirect("/client/indexClient.jsp");
        } catch (NumberFormatException e) {

        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
