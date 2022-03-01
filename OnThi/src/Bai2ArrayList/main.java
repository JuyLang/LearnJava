/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2ArrayList;

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
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng hàng hóa");
        int n = input.nextInt();
        Object Ds[] = new Object[n];
        for (int i = 0; i < n; i++) {
            HangHoa hh = new HangHoa();
            hh.nhap();
            Ds[i] = hh;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(Ds[i]);
            
        }
    }
    
}
