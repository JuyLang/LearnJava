/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisieuthiawt;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class hanghoa {
    private String TenHang;
    private String DonVi;
    private int Dongia;
    private int SoLuong;

    public hanghoa() {
    }

    public hanghoa(String TenHang, String DonVi, int Dongia, int SoLuong) {
        this.TenHang = TenHang;
        this.DonVi = DonVi;
        this.Dongia = Dongia;
        this.SoLuong = SoLuong;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String DonVi) {
        this.DonVi = DonVi;
    }

    public int getDongia() {
        return Dongia;
    }

    public void setDongia(int Dongia) {
        this.Dongia = Dongia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Tên Hàng Hóa");
        TenHang = input.nextLine();
        System.out.println("Nhập Đơn vị tính");
        DonVi = input.nextLine();
        System.out.println("Nhập Đơn giá");
        Dongia = input.nextInt();
        System.out.println("Nhập Số Lượng");
        SoLuong = input.nextInt();
    }

    @Override
    public String toString() {
        return "hanghoa{" + "TenHang=" + TenHang + ", DonVi=" 
                + DonVi + ", Dongia=" + Dongia + ", SoLuong=" + SoLuong + '}';
    }
    
}
