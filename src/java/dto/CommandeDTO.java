/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Commande;
import java.util.Date;

/**
 *
 * @author yyazid slila
 */
public class CommandeDTO {

    private int id;
    private Date date;
    private int clientId;
    private String client;
    private double prix;
    private int produits;

    public CommandeDTO(Commande commande) {
        this.client = commande.getClient().getNom();
        this.clientId = commande.getClient().getId();
        this.date = commande.getDate();
        this.id = commande.getId();
        this.prix = 0;
        this.produits = 0;
        commande.getLigneCommandes().forEach(x -> {
            prix += x.getPrixVente();
            produits += x.getQuantité();
        });

    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getClientId() {
        return clientId;
    }

    public String getClient() {
        return client;
    }

    public double getPrix() {
        return prix;
    }

    public int getProduits() {
        return produits;
    }

}
