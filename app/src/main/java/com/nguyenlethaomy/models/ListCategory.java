package com.nguyenlethaomy.models;

import java.util.ArrayList;

public class ListCategory {
    private ArrayList<Category> categories;

    public ListCategory() {
        categories = new ArrayList<>();
    }

    public void addCategory(Category c) {
        categories.add(c);
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    public void generate_sample_dataset() {
        addCategory(new Category(1, "Electronics"));
        addCategory(new Category(2, "Clothing"));
        addCategory(new Category(3, "Books"));
        addCategory(new Category(4, "Home & Kitchen"));
        addCategory(new Category(5, "Sports"));
    }
}
