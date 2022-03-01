/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de02xeploaidiem;

import java.io.Serializable;

/**
 *
 * @author TrungCH
 */
public class SinhVien extends Person implements Serializable {
    private String chuyenNganh;
    private float diemQT;
    private float diemHP;

    public SinhVien() {
    }

    public SinhVien(String chuyenNganh, float diemQT, float diemHP, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.chuyenNganh = chuyenNganh;
        this.diemQT = diemQT;
        this.diemHP = diemHP;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public float getDiemQT() {
        return diemQT;
    }

    public void setDiemQT(float diemQT) {
        this.diemQT = diemQT;
    }

    public float getDiemHP() {
        return diemHP;
    }

    public void setDiemHP(float diemHP) {
        this.diemHP = diemHP;
    }
    
   public double diemTK(float dqt , float dtp){
    return (dqt*0.3+dtp*0.7);
   }
   
   public String xepLoai(){
    if(diemTK(this.getDiemQT(),this.diemHP)<4){
      return "Loai F";
    }else if(4<diemTK(this.getDiemQT(),this.diemHP) && diemTK(this.getDiemQT(),this.diemHP)<5){
     return "Loai D";
    }else if(5<=diemTK(this.getDiemQT(),this.diemHP) && diemTK(this.getDiemQT(),this.diemHP)<6){
     return "Loai C";
    }else if(6<=diemTK(this.getDiemQT(),this.diemHP) && diemTK(this.getDiemQT(),this.diemHP)<8.5){
     return "Loai B";
    }else if(diemTK(this.getDiemQT(),this.diemHP)>8.5){
     return "Loai A";
    }
    return "";
   }
   
  public String toString(){
   return super.toString() + ("\nChuyenNganh:"+this.getChuyenNganh()
                                            +"\nDiem Qua Trinh:"+this.getDiemQT()
                                             +"\nDiem Thanh Phan:"+this.getDiemHP() 
                                              +"\nXepLoai: "+xepLoai());
  }
}
