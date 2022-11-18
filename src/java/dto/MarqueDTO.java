/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Marque;

/**
 *
 * @author user
 */
public class MarqueDTO {

    private final int id;
    private final String nom;
    private final int produits;

    public MarqueDTO(Marque marque) {
        this.id = marque.getId();
        this.nom = marque.getNom();
        this.produits = marque.getProduits().size();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getProduits() {
        return produits;
    }
    
    
}
