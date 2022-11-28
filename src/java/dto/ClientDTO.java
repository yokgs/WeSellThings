/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Client;

/**
 * @author user
 */
public class ClientDTO {

    private final String nom, prenom, telephone, adresse, email;
    private final int id, commandes;

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.adresse = client.getAdresse();
        this.email = client.getEmail();
        this.nom = client.getNom();
        this.prenom = client.getPrenom();
        this.telephone = client.getTelephone();
        this.commandes = client.getCommandes().size();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public int getCommandes() {
        return commandes;
    }

}
