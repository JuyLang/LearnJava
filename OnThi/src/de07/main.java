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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào số lượng n danh sách thí sinh");
        int n = input.nextInt();
        QuanLy ql = new QuanLy(n);
        ql.nhap(n);
        ql.input();
        System.out.println("Thí sinh trúng tuyển là");
        ql.DsTrungTuyen();
       
    }
    
}
