/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de01kocolithuyet;

import java.util.Date;

/**
 *
 * @author Duy
 */
public class Person {
    protected String hoTen;
    protected int ngaySinh;
    protected String diaChi;
    protected String gioiTinh;

    public Person() {
    }

    public Person(String hoTen, int ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }
    
    

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public String toString(){
      return ("HoTen:  "+this.getHoTen()
                  + "   NgaySinh: "+this.getNgaySinh()
                   +"   DiaChi: "  +this.getDiaChi()
                    +"  GioiTinh: " +this.getGioiTinh() );
    }
    
}
