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
public class TH1_Sinhvien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student[] sv = new Student[5];
       sv[0] = getInfoSV();
        System.out.println(sv[0].toString());
       sv[0].study("Toán");
       sv[0].tuiTion();
    }
    public static Student getInfoSV(){
        String Hoten,Gioitinh,Diachi,email,phoneName;
        float hocphi;
        Scanner input = new Scanner(System.in);
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
        Student a;
        a = new Student(Hoten, Gioitinh,
                Diachi, email, phoneName, hocphi);
        return a;
    }
}
