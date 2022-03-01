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
public class KhoSieuThi{
    private int soluong;
    private ArrayList<SanPham> listKho;
    public KhoSieuThi(int n) {
        this.listKho = new ArrayList<>(n);
    }

    public KhoSieuThi(int soluong, ArrayList<SanPham> listKho) {
        this.soluong = soluong;
        this.listKho = listKho;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public ArrayList<SanPham> getListKho() {
        return listKho;
    }

    public void setListKho(ArrayList<SanPham> listKho) {
        this.listKho = listKho;
    }
    
    public void nhap(int n){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sản phẩm thứ "+i+"vào siêu thị");
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
                   listKho.add(sp);
                }     
        }
    }
    
}
