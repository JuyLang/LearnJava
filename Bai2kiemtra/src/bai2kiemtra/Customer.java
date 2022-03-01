/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2kiemtra;

import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Customer extends Person{
    private String gtHoaDon;
    public Customer() {
        
    }
    public Customer(String gtHoaDon) {
        this.gtHoaDon = gtHoaDon;
    }

    public Customer(String gtHoaDon, String Hoten) {
        super(Hoten);
        this.gtHoaDon = gtHoaDon;
    }
    
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ten Công ty ");
        setHoten(input.nextLine());
        System.out.println("Nhập giá trị đơn hàng");
        gtHoaDon = input.nextLine();
    }

    @Override
    public String toString() {
        return "Tên Công Ty" +getHoten()+ "gtHoaDon=" + gtHoaDon ;
    }
    
}
