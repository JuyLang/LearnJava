/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class HangHoa {
    private int maHang;
    private String tenHang;
    private double soluongTon;
    private double donGia;

    public HangHoa() {
    }

    public HangHoa(int maHang, String tenHang, double soluongTon, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soluongTon = soluongTon;
        this.donGia = donGia;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getSoluongTon() {
        return soluongTon;
    }

    public void setSoluongTon(double soluongTon) {
        this.soluongTon = soluongTon;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public boolean checktenHang(boolean k) {
        if (this.tenHang == "" || this.tenHang.isEmpty()) {
            System.out.println("Nhập Tên hàng, không được để trống : ");
        } else {
            k = false;
        }
        return k;
    }
    
    
     public boolean checkSoLuong(boolean k) {
        if ( this.soluongTon <= 0 ) {
            System.out.println("Số Lượng Tồn Phải Lớn hơn 0");
        } else {
            k = false;
        }
        return k;
        }
      public boolean CheckDonGia(boolean k) {
        if ( this.donGia <= 0 ) {
            System.out.println("Đơn giá Phải Lớn hơn 0");
        } else {
            k = false;
        }
        return k;
        }
      
      public void nhapHangHoa(){
        Scanner input = new Scanner(System.in);
        boolean th = true;
        boolean sl = true;
        boolean dg = true;
        System.out.println("Nhập mã hàng ");
        setMaHang(input.nextInt());
         do {
            setTenHang(input.nextLine());
        } while (checktenHang(th));  // kiểm tra tên hàng
        do {
            System.out.println("Nhập Số Lượng Tồn, phải lớn hơn 0 ");
            setSoluongTon(input.nextDouble());
        } while (checkSoLuong(sl));  // kiểm tra có tồn hay không
         do {
            System.out.println("Nhập Đơn Giá, phải lớn hơn 0   : ");
            setDonGia(input.nextDouble());
        } while (checkSoLuong(dg));  // kiểm tra đơn giá
      }
      
    @Override
    public String toString() {
        return "HangHoa{" + "maHang=" + maHang + ", tenHang=" + tenHang + ", soluongTon=" + soluongTon + ", donGia=" + donGia + '}';
    }
    
    
}
