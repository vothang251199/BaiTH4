package com.example.baith4;

public class Mon {
    int imgAnh;
    String tenMon, giaMon;

    public Mon(int imgAnh, String tenMon, String giaMon) {
        this.imgAnh = imgAnh;
        this.tenMon = tenMon;
        this.giaMon = giaMon;
    }

    public int getImgAnh() {
        return imgAnh;
    }

    public void setImgAnh(int imgAnh) {
        this.imgAnh = imgAnh;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getGiaMon() {
        return giaMon;
    }

    public void setGiaMon(String giaMon) {
        this.giaMon = giaMon;
    }
}
