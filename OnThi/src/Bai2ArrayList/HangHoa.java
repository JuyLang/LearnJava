/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2ArrayList;


import java.util.Scanner;

/**
 *
 * @author langk
 */
public class HangHoa {
    private String TenHang;
    private float Gia;
    private String HSD;

    public HangHoa() {
    }

    public HangHoa(String TenHang, float Gia, String HSD) {
        this.TenHang = TenHang;
        this.Gia = Gia;
        this.HSD = HSD;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }

    public String getHSD() {
        return HSD;
    }

    public void setHSD(String HSD) {
        this.HSD = HSD;
    }

   
    
    
    public  void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Tên Hàng ");
        TenHang = input.nextLine();
        System.out.println("Nhập Giá Hàng ");
        Gia = input.nextFloat();
        System.out.println("Nhập Hạn sử dụng ");
        HSD = input.nextLine();
    }

    @Override
    public String toString() {
        return "HangHoa{" + "TenHang=" + TenHang + ", Gia=" + Gia + ", HSD=" + HSD + '}';
    }
    
}
