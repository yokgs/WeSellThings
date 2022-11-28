/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Client;
import entities.Commande;
import entities.CommandeEtatConverter;

import java.util.Date;

/**
 * @author yazid slila
 */
public class CommandeDTO {

    private final int id;
    private final Date date;
    private final int clientId;
    private final String client, etat;
    private double prix;
    private int produits;

    public CommandeDTO(Commande commande) {
        Client c = commande.getClient();
        this.client = c == null ? "" : c.getNom();
        this.clientId = c == null ? 1 : c.getId();
        this.date = commande.getDate();
        this.id = commande.getId();
        this.prix = 0;
        this.produits = 0;
        this.etat = (new String[]{
            "Annulée",
            "En cours",
            "Approvée",
            "Livrée"
        })[(new CommandeEtatConverter()).convertToDatabaseColumn(commande.getEtat())];

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
