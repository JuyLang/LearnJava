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
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng danh sách hàng hóa");
        int n = input.nextInt();
        QuanLiHangHoa ql = new QuanLiHangHoa(n);
        ql.add();
        System.out.println("nhập vào tên hàng để xem thông tin hàng ");
        String ten = input.nextLine();
        ql.find(ten);
        ql.sapxepTheoTen();
        System.out.println(ql);
    }
    
}
