/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de01hanghoa;

import java.io.Serializable;

/**
 *
 * @author TrungCH
 */
public class HangHoa implements Serializable{
    private static long serialVersionUID = 123L;
    protected String maHang;
    protected String tenHang;
    protected float giaBan;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, float giaBan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.giaBan = giaBan;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    
    public String toString(){
      return ("MaHang: "+this.getMaHang()
                 +"\nTenHang: "+this.getTenHang()
               + "\nGiaBan: "+this.getGiaBan());
    }
}
