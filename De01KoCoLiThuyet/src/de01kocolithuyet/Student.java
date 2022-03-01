/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de01kocolithuyet;

import java.io.Serializable;

/**
 *
 * @author TrungCH
 */
public class Student extends Person implements Serializable{
    protected String maSV;
    protected String email;
    protected float diemTB;

    public Student() {
    }

    public Student(String maSV, String email, float diemTB, String hoTen, int ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSV = maSV;
        this.email = email;
        this.diemTB = diemTB;
    }
    
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    
    public String toString() {
        return ("HoTen:  " + this.getHoTen()
                +"  MaSV: " + this.getMaSV()
                + " NgaySinh: " + this.getNgaySinh()
                + " DiaChi: " + this.getDiaChi()
                + " GioiTinh: " + this.getGioiTinh())
                +"  Email: " +this.getEmail()
                +"  DiemTB: "+this.getDiemTB();
    }
    
}
