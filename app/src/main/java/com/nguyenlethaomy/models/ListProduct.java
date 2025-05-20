package com.nguyenlethaomy.models;

import java.util.ArrayList;

public class ListProduct {
    private ArrayList<Product> products;

    public ListProduct() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void generate_sample_dataset() {
        addProduct(new Product(1, "Smartphone", 10, 699.99, 1));
        addProduct(new Product(2, "T-shirt", 50, 19.99, 2));
        addProduct(new Product(3, "Cookbook", 25, 14.99, 3));
        addProduct(new Product(4, "Blender", 15, 39.99, 4));
        addProduct(new Product(5, "Football", 20, 24.99, 5));
        addProduct(new Product(6, "Laptop", 8, 1199.99, 1));
        addProduct(new Product(7, "Headphones", 30, 89.99, 1));
        addProduct(new Product(8, "Jeans", 40, 49.99, 2));
        addProduct(new Product(9, "Jacket", 20, 89.99, 2));
        addProduct(new Product(10, "Novel", 60, 12.99, 3));
        addProduct(new Product(11, "Children's Book", 35, 9.99, 3));
        addProduct(new Product(12, "Microwave", 12, 89.99, 4));
        addProduct(new Product(13, "Rice Cooker", 18, 59.99, 4));
        addProduct(new Product(14, "Yoga Mat", 25, 15.99, 5));
        addProduct(new Product(15, "Dumbbells", 10, 34.99, 5));
        addProduct(new Product(16, "Monitor", 6, 199.99, 1));
        addProduct(new Product(17, "Keyboard", 22, 49.99, 1));
        addProduct(new Product(18, "Sneakers", 28, 69.99, 2));
        addProduct(new Product(19, "Thermos Bottle", 40, 17.99, 4));
        addProduct(new Product(20, "Basketball", 15, 21.99, 5));
    }
}
