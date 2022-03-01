/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De02MN;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class SanPham {
    private String TenSP,MaSP;
    private Float Dongia;
    private int NSX;
    private int Soluong;

    public SanPham() {
    }

    public SanPham(String TenSP, String MaSP, Float Dongia, int NSX) {
        this.TenSP = TenSP;
        this.MaSP = MaSP;
        this.Dongia = Dongia;
        this.NSX = NSX;
    }
    
    public SanPham(String TenSP, String MaSP, Float Dongia, int NSX,int Soluong) {
        this.TenSP = TenSP;
        this.MaSP = MaSP;
        this.Dongia = Dongia;
        this.NSX = NSX;
        this.Soluong = 0;
    }
    
    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public Float getDongia() {
        return Dongia;
    }

    public void setDongia(Float Dongia) {
        this.Dongia = Dongia;
    }

    public int getNSX() {
        return NSX;
    }

    public void setNSX(int NSX) {
        this.NSX = NSX;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }
    
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tên sản phẩm");
        TenSP = input.nextLine();
        System.out.println("Nhập vào mã sản phẩm");
        MaSP = input.nextLine();
        System.out.println("Nhập vào đơn giá sản phẩm");
        Dongia = input.nextFloat();
        System.out.println("Nhập vào ngày sản xuất sản phẩm");
        NSX = input.nextInt();
    }
    @Override
    public String toString() {
        return "SanPham{" + "TenSP=" + TenSP + ", MaSP=" + MaSP + ", Dongia=" + Dongia + ", NSX=" + NSX + '}';
    }
    
}
