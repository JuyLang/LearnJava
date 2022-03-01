/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De01;

import Bai2.ArratList;
import Bai2ArrayList.HangHoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        System.out.println("nhập vào số lượng danh sách");
        
        QLSV ds = new QLSV(Integer.parseInt(input.nextLine()));
        ds.nhap();
        System.out.println(ds);
        
        System.out.println("Nhập vào mã sv bạn muốn tìm");
        System.out.println(ds.Find(input.nextLine()));
        
        System.out.println("đây là danh sách đã sắp xếp theo tên");
        ds.SapXepTheoTen();
        
        System.out.println(ds);
      
    }  
}