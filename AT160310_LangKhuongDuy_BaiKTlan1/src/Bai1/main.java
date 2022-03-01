/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

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
         
         HangThucPham []arr = new HangThucPham[3];
          System.out.println("nhập 3 đơn hàng vào danh sách");
         for (int i = 0; i < 3; i++) {
             int count = 1+i;
             System.out.println("-------đơn hàng "+count+" -------");
            HangThucPham tp = new HangThucPham();
            tp.nhap();
            arr[i] = tp;
        }
         System.out.println("Mã hàng    Tên hàng Đơn Giá      Ngày Sản Xuất      Ngày Hết hạn    Ghi Chú");
         for (int i = 0; i < 3; i++) {
             System.out.print(arr[i].toString());;
             arr[i].ChecktimeHSD();
        }
    }
    
}
