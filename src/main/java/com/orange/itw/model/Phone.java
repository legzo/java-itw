package com.orange.itw.model;

import java.util.ArrayList;
import java.util.Collection;

public class Phone {

    private String name;
    private String brand;

    private boolean isInStock = true;

    private float price;

    private Collection<Discount> discounts = new ArrayList<>();

    public Phone(String name, String brand, float price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // TODO 1 : Ajouter une méthode pour retourner le nom complet du téléphone
    // formaté comme suit : "Marque Modèle" (marque et modèle commencent par
    // une majuscule). Utiliser cette méthode là où c'est utile.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }


    // TODO 2 : Modifier la méthode getPrice pour retourner le prix en tenant compte des
    // discounts. On applique seulement la première discount valide (une discount
    // est valide si et seulement si la startDate est dépassée et l'endDate pas
    // encore atteinte).

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Collection<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Collection<Discount> discounts) {
        this.discounts = discounts;
    }


}
