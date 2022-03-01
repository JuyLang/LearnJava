/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de03text;

import java.io.Serializable;

/**
 *
 * @author TrungCH
 */
public class NhanVien extends Person1 implements Serializable {
    protected String phongBan;
    protected float heSoLuong;
    protected float thamNien;
    protected float luongCB;

    public NhanVien() {
    }

    public NhanVien(String phongBan, float heSoLuong, float thamNien, float luongCB, String hoTen, int ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCB = luongCB;
    }
    
    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public float getThamNien() {
        return thamNien;
    }

    public void setThamNien(float thamNien) {
        this.thamNien = thamNien;
    }

    public float getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(float luongCB) {
        this.luongCB = luongCB;
    }
    
    public String toString() {
        return ("HoTen:  " + this.getHoTen()
                + "   NgaySinh: " + this.getNgaySinh()
                + "   DiaChi: " + this.getDiaChi()
                + "  GioiTinh: " + this.getGioiTinh())
                +"   PhongBan: " +this.getPhongBan()
                +"   HeSoLuong: " +this.getHeSoLuong()
                + "  ThamNien: " +this.getThamNien()
                +"   LuongCoBan: "+this.getLuongCB()
                +"   Luong Thuc Linh: " +luongThucLinh(this.getLuongCB(),this.getHeSoLuong(),this.getThamNien());
    }
        
 public float luongThucLinh (float lcb,float hs,float tn){
   float k = lcb *hs*(1+(tn/100));
   return k;
 }   
}
