/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Client;
import entities.Commande;
import entities.LigneCommande;
import entities.LigneCommandePK;
import org.hibernate.Hibernate;
import service.CommandeService;
import service.LigneCommandeService;
import service.ProduitService;
import service.UserService;
import util.HibernateUtil;

/**
 * @author a
 */
public class Test1 {
    public static void main(String[] args) {
        //HibernateUtil.getSessionFactory().openSession();
        
        CommandeService cs = new CommandeService();
        ProduitService ps=new  ProduitService();
        LigneCommandePK pk = new LigneCommandePK(1,4);
        LigneCommande ll = new LigneCommande(pk, 55, 99);
        LigneCommandeService ls = new LigneCommandeService();
        ls.create(ll);
    }
}
