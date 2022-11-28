/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Lachgar
 */
@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom, designation, description;
    private double prix;
    private int unite;
    private byte[] image;

    @ManyToOne
    private Categorie categorie;
    @ManyToOne
    private Marque marque;

    @OneToMany(mappedBy = "produit", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)

    private List<LigneCommande> ligneCommandes;

    public Produit() {
    }

    public Produit(String nom, String designation, byte[] image, String description, double prix, int unite, Categorie categorie, Marque marque) {
        this.nom = nom;
        this.designation = designation;
        this.image = image;
        this.description = description;
        this.prix = prix;
        this.unite = unite;
        this.categorie = categorie;
        this.marque = marque;
    }

    public List<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getUnite() {
        return unite;
    }

    public void setUnite(int unite) {
        this.unite = unite;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

}
