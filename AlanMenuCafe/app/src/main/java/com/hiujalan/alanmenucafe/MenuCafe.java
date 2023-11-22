package com.hiujalan.alanmenucafe;

public class MenuCafe {
    private String nama,category,area,detail,img;

//    public MenuCafe(String nama, String category,int img,String area,String detail) {
//        this.nama = nama;
//        this.detail = detail;
//        this.category = category;
//        this.img = img;
//        this.area = area;
//    }

    public MenuCafe(String nama, String category,String img,String area, String detail) {
        this.nama = nama;
        this.category = category;
        this.img = img;
        this.area = area;
        this.detail = detail;
    }

    public String getNama() {
        return nama;
    }

    public String getDetail() {
        return detail;
    }

    public String getCategory() {
        return category;
    }

    public String getImg() {
        return img;
    }

    public String getArea() {
        return area;
    }

}
