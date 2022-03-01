/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1DiemVaDoanThang;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class DoanThang {
    private Diem A;
    private Diem B;

    public DoanThang() {
    }
    
    public void nhap(){
        A = new Diem();
        B = new Diem();
        System.out.println("Nhập vào tọa độ Điểm A");
        A.nhap();
        System.out.println("Nhập vào tọa độ Điểm B");
        B.nhap();
    }
    public double Dodai(){
        return Math.sqrt(Math.pow((B.getX() - A.getX()), 2) + Math.pow((B.getY() - A.getY()), 2));
    }

    @Override
    public String toString() {
        return "DoanThang: " + "A=" + A + ", B=" + B + "Độ Dài AD = " + Dodai();
    }
    
}
