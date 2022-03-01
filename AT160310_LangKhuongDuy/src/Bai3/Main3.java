/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap co can chuyen (co so 10): ");
        int n = scan.nextInt();
        System.out.println("so " + n + " khi chuyen sang co so 2 la: ");
        convertHextoBin(n);
    }

    public static void convertHextoBin(int n) {
        for (int i = 7; i >= 0; i--) {
            int k = n >> i;
            if (k == 1) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        System.out.println("");
    }    }
    
