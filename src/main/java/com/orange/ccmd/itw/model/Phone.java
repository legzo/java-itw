package com.orange.ccmd.itw.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 *  TODO 1 : Ajouter une méthode pour retourner le nom complet du téléphone
 *  formaté comme suit : "Marque Modèle".
 *
 *  TODO 2 : Compléter la méthode getDiscountedPrice pour retourner le prix
 *  en tenant compte des discounts. On applique seulement la première discount
 *  valide (une discount est valide si et seulement si la startDate est
 *  dépassée et l'endDate pas encore atteinte).
 */
public class Phone {

    private String model;
    private String brand;

    private boolean isInStock = true;

    private float price;

    private Collection<Discount> discounts = new ArrayList<>();

    public Phone(String model, String brand, float price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public float getDiscountedPrice() {
        return 0f;
    }

}
