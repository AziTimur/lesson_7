package com.example.lesson7android1.Fragment1;

import java.io.Serializable;

public class ModelHeros implements Serializable {
    private int avatar;
    private String status, name;

    public ModelHeros(int avatar, String status, String name) {
        this.avatar = avatar;
        this.status = status;
        this.name = name;

    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}