/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th1_sinhvien;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Main {
    public static void main(String[] args) {
        int Masv;
        String hoTen,Hoten,Gioitinh,Diachi,email,phoneName;
        float hocphi;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào maSV");
        Masv = input.nextInt();
        System.out.println("Nhập vào hoTen");
        Hoten = input.nextLine();
        System.out.println("Nhập vào GioiTinh");
        Gioitinh = input.nextLine();
        System.out.println("Nhập vào diaChi");
        Diachi = input.nextLine();
        System.out.println("Nhập vào email");
        email = input.nextLine();
        System.out.println("Nhập vào phone");
        phoneName = input.nextLine();
        System.out.println("Nhập vào Hocphi");
        hocphi = input.nextFloat();
        Student sv;
        sv = new Student(Masv, Hoten, Gioitinh, Diachi, email, phoneName, hocphi);
        sv.toString();
    }
}
