/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2kiemtra;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Employee extends Person{
    private float lcb;
    private float hsl;

    public Employee() {
    }

    public Employee(float lcb, float hsl) {
        this.lcb = lcb;
        this.hsl = hsl;
    }

    public Employee(float luong, float hsl, String Hoten, String Diachi) {
        super(Hoten, Diachi);
        this.lcb = luong;
        this.hsl = hsl;
    }
    
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Họ Tên");
        setHoten(input.nextLine());
        System.out.println("Nhập Địa Chỉ");
        setDiachi(input.nextLine());
        System.out.println("Nhập Lương Cơ Bản");
        lcb = input.nextFloat();
        System.out.println("Nhập hệ số lương");
        hsl = input.nextFloat();
    }
    public double tinhLuong(){
        return lcb*hsl;  
    }

    @Override
    public String toString() {
        return "Họ tên : "+ getHoten() + ", Địa Chỉ : "
                + getDiachi() + ", lương cơ bản : " + lcb + ", hsl : " + hsl + 
                ", Lương thực nhận "+ tinhLuong() ;
    }
    
}
