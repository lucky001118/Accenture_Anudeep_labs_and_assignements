package com.labx2;

public class User {
    int id;
    String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Parameterized constructor to initialize id and name
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
