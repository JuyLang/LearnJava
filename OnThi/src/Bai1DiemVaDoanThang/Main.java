/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1DiemVaDoanThang;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n;
//        DoanThang dt1 = new DoanThang();
//        dt1.nhap();
//        System.out.println(dt1.toString());
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử");
        n = input.nextInt();
        ArrayList<DoanThang> DsDT = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Đoạn thẳng thứ "+i);
            DoanThang dt = new DoanThang();
            dt.nhap();
            DsDT.add(i,dt); // phần tử ở vị trí thứ i và có giá trị theo dt
            
        }
        System.out.println(DsDT);
    }
    
}
