package com.hiujalan.alanmenucafe;

public class MenuCafe {
    private String nama;
    private String detail;
    private int harga;
    private int img;
    private int rating;

    public MenuCafe(String nama, int harga,int img,int rating,String detail) {
        this.nama = nama;
        this.detail = detail;
        this.harga = harga;
        this.img = img;
        this.rating = rating;
    }

    public String getNama() {
        return nama;
    }

    public String getDetail() {
        return detail;
    }

    public int getHarga() {
        return harga;
    }

    public int getImg() {
        return img;
    }

    public int getRating() {
        return rating;
    }

}
