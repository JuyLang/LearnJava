/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2kiemtra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author langk
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Student sv = new Student();
//        System.out.println("Nhập Họ tên");
//            sv.setHoten(input.nextLine());
//        System.out.println("Nhập Địa Chỉ");
//            sv.setDiachi(input.nextLine());
//            sv.nhap();
//            sv.xuat();

//        System.out.println("Nhập Số Lượng danh sách nhân viên");
//        int n = input.nextInt();
//        Employee []a = new Employee[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("----- Nhập thông tin Nhân Viên " + i + "----- ");
//            Employee nv = new Employee();
//            nv.nhap();
//            a[i]  = nv;
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println("------------ Nhân Viên " + i + "------------");
//            System.out.println(a[i].toString());
//        }

//          Employee nv = new Employee();
//          nv.nhap();
//          System.out.println(nv.toString());

//            Scanner input = new Scanner(System.in);
//            System.out.println("Nhập số lượng phần tử danh sách quản lí");
//            int n = input.nextInt();
//            Management quanli = new Management(n);
//            quanli.add();
//            quanli.xuat();
//            
                  ArrayList aList = new ArrayList();
                  aList.add("A");
                  aList.add("B");
                  aList.add("C");
                  aList.add("D");
                  aList.add("E");
                  System.out.println("The element C is available in ArrayList? " + aList.contains("C"));
                  System.out.println("The element Z is available in ArrayList? " + aList.indexOf("C"));  
    }
    
}
