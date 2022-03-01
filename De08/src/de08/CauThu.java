/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de08;

import java.io.Serializable;

/**
 *
 * @author TrungCH
 */
public class CauThu implements Serializable {
    private String id;
    private String ten;
    private int namSinh;
    private String viTri;

    public CauThu() {
    }

    public CauThu(String id, String ten, int namSinh, String viTri) {
        this.id = id;
        this.ten = ten;
        this.namSinh = namSinh;
        this.viTri = viTri;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
    
    
    
}
