/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author user
 */
@Entity
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;

    @ManyToOne
    private Categorie supCategorie;
    @OneToMany(mappedBy = "supCategorie")
    private List<Categorie> categories;

    public Categorie(String nom, Categorie categorie) {
        this.nom = nom;
        this.supCategorie = categorie;
    }

    public Categorie() {
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

    public Categorie getSupCategorie() {
        return supCategorie;
    }

    public void setSupCategorie(Categorie supCategorie) {
        this.supCategorie = supCategorie;
    }

}
