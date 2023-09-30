package com.example.amazoncloneapplication.model;

public class FavoriteItem {
    private String name, totalAmount;
    public FavoriteItem() {
        // Default constructor required for Firebase
    }

    public FavoriteItem(String name, String totalAmount) {
        this.name = name;
        this.totalAmount = totalAmount;
    }

    // Getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }
}