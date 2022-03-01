/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // Khai bao doi tuong
        try (Scanner input = new Scanner(System.in)) {
            // Khai bao doi tuong
            Matran mt1 = new Matran();
            Matran mt2 = new Matran();
            Matran mtTong;
            Matran mtTich;
            Matran mtHieu;
            Matran mtChuyenVi;
            Matran mtDoiDau;
            
            // Nhap ma tran
            System.out.println("Nhap vao ma tran thu nhat:");
            mt1.nhap(input);
            System.out.println("Nhap vao ma tran thu hai:");
            mt2.nhap(input);
            System.out.println("Ma tran thu nhat vua nhap la:");
            mt1.print();
            System.out.println("Ma tran thu hai vua nhap la:");
            mt2.print();
            // Tinh tong 2 ma tran
            mtTong = mt1.cong(mt2);
            
            // Tinh tich 2 ma tran
            mtTich = mt1.tich(mt2);
            
            // Tinh hieu 2 ma tran
            mtHieu = mt1.hieu(mt2);
            mtChuyenVi = mt1.chuyenVi();
            mtDoiDau = mt1.doiDau();
            // Hien thi
            
            System.out.println("Ma tran tong la:");
            mtTong.print();
            System.out.println("Ma tran tich la:");
            mtTich.print();
            System.out.println("Ma tran hieu la:");
            mtHieu.print();
            System.out.println("Ma tran chuyen vi la:");
            mtChuyenVi.print();
            System.out.println("Ma tran doi dau la:");
            mtDoiDau.print();
            
            mt1.tuongThich(mt2);
            // Tinh tong cac phan tu tren hang 3 cua mt1
            mt1.maTranVuong(); // Minh gia su ma tran vuong 3x3 nhe
            System.out.println("tong cot 1: "+mt1.tongCotK(1));
            System.out.println("tong hang 1: "+mt1.tongHangK(1));
            System.out.println("diem yen ngua: "+mt1.yenNgua());
        }
    }
    
}
