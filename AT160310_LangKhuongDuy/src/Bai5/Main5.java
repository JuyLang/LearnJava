/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Main5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        Vecto v1 = new Vecto();
        Vecto v2 = new Vecto();
        Vecto cong;
        Vecto hieu;
        Vecto tich;
        Vecto chuanHoa;

        System.out.println("Nhap vao vecto thu nhat:");
        v1.nhap(sc);
        System.out.println("Nhap vao vecto thu hai:");
        v2.nhap(sc);
        System.out.println("Vecto thu nhat vua nhap la:");
        v1.print();
        System.out.println("Vecto thu hai vua nhap la:");
        v2.print();

        System.out.println("nhap so can nhan vs vecto: ");
        int k = sc.nextInt();
        System.out.println("cong 2 vecto: ");
        cong = v1.cong(v2);
        cong.print();
        System.out.println("hieu 2 vecto: ");
        hieu = v1.hieu(v2);
        hieu.print();
        System.out.println("tich vecto vs 1 so: ");
        tich = v1.tich(k);
        tich.print();
        System.out.println("Chuan hoa vecto: ");
        chuanHoa = v1.chuanHoa();
        chuanHoa.print();
        System.out.println("tich vo huong: " + v1.tichVoHuong(v2));
        System.out.println("Vecto thu nhat " + v1.vuongGoc(v2) + " Vecto thu hai");
    
    }
    
}
