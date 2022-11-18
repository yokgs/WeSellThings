/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Produit;

/**
 *
 * @author user
 */
public class ProduitDTO {

    private final int id;
    private final String nom, designation, image, description;
    private final double prix;
    private final int unite;
    private final String categorie;
    private final String marque;
    private final int ligneCommandes;

    public ProduitDTO(Produit produit) {
        this.categorie = produit.getCategorie().getNom();
        this.description = produit.getDescription();
        this.designation = produit.getDesignation();
        this.id = produit.getId();
        this.image = produit.getImage();
        this.ligneCommandes = produit.getLigneCommandes().size();
        this.marque = produit.getMarque().getNom();
        this.nom = produit.getNom();
        this.prix = produit.getPrix();
        this.unite = produit.getUnite();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDesignation() {
        return designation;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public int getUnite() {
        return unite;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getMarque() {
        return marque;
    }

    public int getLigneCommandes() {
        return ligneCommandes;
    }

}
