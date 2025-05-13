package com.notification.demo;

public class User {
    private String name;
    private long id;
    private String email;
    private String password;



    public User(long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }


}
