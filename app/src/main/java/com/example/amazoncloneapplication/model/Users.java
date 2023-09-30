package com.example.amazoncloneapplication.model;

public class Users {

    String uid;
    String  name;
    String email;
    String imageUrl;
    public Users(String uid, String name, String email, String imageUrl){
        this.uid= uid;
        this.name= name;
        this.email = email;
        this.imageUrl = imageUrl;
    }

    public String getUid() {
        return uid;
    }


    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
