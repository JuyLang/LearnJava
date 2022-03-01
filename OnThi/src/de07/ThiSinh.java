/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de07;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public abstract class ThiSinh {
    private String HoTen, DiaChi;
    private int NgaySinh;

    public ThiSinh() {
    }

    public ThiSinh(String HoTen, String DiaChi, int NgaySinh) {
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.NgaySinh = NgaySinh;
    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào Họ Tên");
        HoTen= input.nextLine();
        System.out.println("Nhập vào địa chỉ");
        DiaChi = input.nextLine();
        System.out.println("Nhập ngày sinh");
        NgaySinh = input.nextInt();
    }

    @Override
    public String toString() {
        return "ThiSinh{" + "HoTen=" + HoTen + ", DiaChi=" + DiaChi + ", NgaySinh=" + NgaySinh + '}';
    }
    public  abstract  void kiemtra();
}
