package com.nguyenlethaomy.models;

import androidx.annotation.NonNull;
import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private int cateId;

    public Product() {
    }

    public Product(int id, String name, int quantity, double price, int cateId) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.cateId = cateId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    @NonNull
    @Override
    public String toString() {
        return id + " - " + name + " | Qty: " + quantity + " | Price: " + price + " | Category ID: " + cateId;
    }
}
