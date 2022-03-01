/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De02MN;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author langk
 */
public class HoaDon {
    private  int Soluong;
    private Float thanhtien;
    private ArrayList<SanPham> listSP;

    public HoaDon(int n) {
        this.listSP = new ArrayList<>(n);
    }

    public HoaDon(int Soluong, Float thanhtien, ArrayList<SanPham> listSP) {
        this.Soluong = 0;
        this.thanhtien = thanhtien;
        this.listSP = listSP;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public Float getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(Float thanhtien) {
        this.thanhtien = thanhtien;
    }

    public ArrayList<SanPham> getListSP() {
        return listSP;
    }

    public void setListSP(ArrayList<SanPham> listSP) {
        this.listSP = listSP;
    }
    
    public void nhap(int n){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sản phẩm thứ "+i+"vào hóa đơn");
            
            System.out.println("Nhập vào tên sản phẩm");
            String TenSP = input.nextLine();
            System.out.println("Nhập vào mã sản phẩm");
            String MaSP = input.nextLine();
            System.out.println("Nhập vào đơn giá sản phẩm");
            float Dongia = input.nextFloat();
            System.out.println("Nhập vào ngày sản xuất sản phẩm");
            int NSX = input.nextInt();
            SanPham sp = new SanPham(TenSP, MaSP, Dongia, NSX);
             if(sp.getMaSP().compareTo(MaSP)==0){
                  sp.setSoluong( sp.getSoluong()+ 1); //thêm số lượng
             }else{
                   listSP.add(sp);
                }     
        }
     }
    
    
}
