/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlicanbo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author langk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static ArrayList<CanBo> ArrayCanbo = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
            int choose;
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            // interger.parseInt là chuyển chuỗi thành int 
            switch(choose){
                case 1: 
                    inputData();
                    break;
                case 2:
                    searchByName();
                    break;
                case 3:
                    showData();
                    break;
                case 4:
                    System.out.println("Thoat!!");
                    break;
                default:
                    System.out.println("NhapSai");
                    break;
            }
        
        showData();
    }
    static void showMenu(){
        System.out.println("1. Nhập cán bộ");
        System.out.println("2. Tìm kiếm thông tin theo tên");
        System.out.println("3. Hiển thị");
        System.out.println("4. Thoát");     
    }
    static void inputData() {
        System.out.println("Nhập Số cán bộ cần thêm");
        int n; 
        n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Cán Bộ thứ "+ i);
            int choose;
            System.out.println("1. Nhập thông tin Công nhân");
            System.out.println("2. Nhập thông tin Kỹ sư");
            System.out.println("3. Nhập thông tin Nhân Viên Phục Vụ");
            System.out.println("4. Chon");
            choose = Integer.parseInt(input.nextLine()); 
            switch(choose){
                case 1:
                    CanBo nv = new Nhanvien();
                    nv.nhap();
                    ArrayCanbo.add(nv);
                    break;
                case 2:
                    CanBo ks = new Kysu();
                    ks.nhap();
                    ArrayCanbo.add(ks);
                    break;
                case 3:
                    CanBo nvgv = new Nhanviengiupviec();
                    nvgv.nhap();
                    ArrayCanbo.add(nvgv);
                    break;
                case 4:
                    System.out.println("Thoat!!");
                    break;
                default:
                    System.out.println("NhapSai");
                    break;
            }
        }
        
    }
//    static CanBo createCanbo(){
//        
//    }
    static void showData() {
        for(CanBo canBo: ArrayCanbo){
            System.out.println(canBo.toString());
        }
    }

    static void searchByName() {
        
    }
}
