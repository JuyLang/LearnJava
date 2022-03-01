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
         HangThucPham tp = new HangThucPham();
         boolean kt = true;
         boolean th = true;
        System.out.println("Nhập mã hàng : ");
        tp.setMaHang(input.nextInt());
        
        do {
            System.out.println("Nhập tên hàng : "); 
            tp.setTenHang(input.nextLine());
        } while (tp.checkNameProduct(kt));  // kiểm tra tên có nhập đúng không,sai nhập lại
        
        System.out.println("Nhập đơn giá : ");
        tp.setDonGia(input.nextDouble());   // nhập đơn giá 
        
        do {
            System.out.println("Nhập năm,tháng,ngày sản xuất : ");
            tp.inputNSX(input.nextInt(), input.nextInt(), input.nextInt());
            System.out.println("nhập năm,tháng,ngày hết hạn : ");
            tp.inputHSD(input.nextInt(), input.nextInt(), input.nextInt());
        } while (tp.CheckTimeInvalid(th));  // nhập vào ngày sản xuất và hạn sử dụng
                                            //nếu sai HSD < NSX thì nhập lại
      
        System.out.println(tp.toString()); // in ra tp vừa tạo
        tp.ChecktimeHSD(); // kiêm tra xem còn hạn sử dụng hay không 
        
    }
    
}
