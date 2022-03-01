/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De01;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Person {
    private String HoTen,DiaChi;
    private String GioiTinh;
    private int NgaySinh;

    public Person() {
    }

    public Person(String HoTen, String DiaChi, String GioiTinh, int NgaySinh) {
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public int getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(int NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Họ Tên");
        HoTen = input.nextLine();
        System.out.println("Nhập Giới Tính");
        GioiTinh = input.nextLine();
        System.out.println("Nhập Ngày Sinh");
        NgaySinh = input.nextInt();
        System.out.println("Nhập Địa Chỉ");
        DiaChi = input.nextLine();
    }

    @Override
    public String toString() {
        return  "HoTen=" + HoTen + 
                ", DiaChi=" + DiaChi + 
                ", GioiTinh=" + GioiTinh + 
                ", NgaySinh=" + NgaySinh ;
    }
    
    
}
