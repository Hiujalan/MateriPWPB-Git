package com.hiujalan.alanprojectminggu3;

public class Pokemon {

    private String name;
    private int number;
    private int img;

    public Pokemon(String name, int number, int img) {
        this.name = name;
        this.number = number;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getImg() {
        return img;
    }


}
