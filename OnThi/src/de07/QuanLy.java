/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author langk
 */
public class QuanLy{
    private ArrayList<ThiSinh> list;

    public QuanLy(int n) {
        list = new ArrayList<ThiSinh>(n);
    }
    
    public ThiSinh nhap(int n){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Bạn muốn thêm sinh viên khối nào vào danh sách");
            System.out.print("1. Thí sinh Khối A");
            System.out.print("2. Thí sinh Khối C");
            System.out.print("Bất kỳ - Không nhập");
            int x = input.nextInt();
            switch (x) {
                case 1:
                    ThiSinhKhoiA tsA = new ThiSinhKhoiA();
                    tsA.nhap();
                    list.add(tsA);
                    break;
                case 2:
                    ThiSinhKhoiB tsB = new ThiSinhKhoiB();
                    tsB.nhap();
                    list.add(tsB);
                    break;
                default:
                    System.out.println("Thoát");
                    
                    break;
                 }
            }              
        return null;
    }

    public void input(){
        
        list.forEach((x) -> {
            System.out.println(x);
        });
    }
    
    public void DsTrungTuyen(){
        for (ThiSinh ts : list) {
            ts.kiemtra();
        }
    }
}
