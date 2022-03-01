/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de03;

/**
 *
 * @author TrungCH
 */
public class SinhVien {
    protected String hoTen;
    protected String maSV;
    protected float diemHP;
    protected float diemQT;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV, float diemHP, float diemQT) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diemHP = diemHP;
        this.diemQT = diemQT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public float getDiemHP() {
        return diemHP;
    }

    public void setDiemHP(float diemHP) {
        this.diemHP = diemHP;
    }

    public float getDiemQT() {
        return diemQT;
    }

    public void setDiemQT(float diemQT) {
        this.diemQT = diemQT;
    }
    
    @Override
    public String toString(){
      return ("HoTen: "+this.getHoTen()
                  +"\nMaSV: "+this.getMaSV()
                  +"\nDiemHP: "+this.getDiemHP()
                   +"\nDiemQT: "+this.getDiemQT());
    }
  public double diemTB(float dqt, float dtp){
    return (dqt*0.3+dtp*0.7);
  }  
}
