/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Categorie;

/**
 * @author user
 */
public class CategorieDTO {

    private final int id, produits;
    private final String nom, categorie;

    public CategorieDTO(Categorie categorie) {
        this.id = categorie.getId();
        this.nom = categorie.getNom();
        this.produits = categorie.getProduits().size();
        this.categorie = categorie.getSupCategorie() == null ? "" : categorie.getSupCategorie().getNom();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public int getProduits() {
        return produits;
    }
    

}
