/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       QuickSort so = new QuickSort(4);
        so.nhap();
        so.Sort();
        so.print();
    }
}
