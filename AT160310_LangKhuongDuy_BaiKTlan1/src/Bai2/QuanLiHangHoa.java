/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author langk
 */
public class QuanLiHangHoa {
     private int n;
    public ArrayList<HangHoa> arr ;
    Scanner input = new Scanner(System.in);
    public QuanLiHangHoa(int n) {
        this.n = n;
        arr = new ArrayList<HangHoa>(n);;
    }
    
    public boolean checkmahangds(String mh){
        if (arr.contains(mh)) {
              return true;
        }
        else{
              return  true;
        }
    }
    public void add(){
        System.out.println("1. Thêm hàng thực phẩm vào danh sách ");
        System.out.println("2. Thêm hàng điện máy vào danh sách ");
        System.out.println("3. Thêm hàng sành sứ vào danh sách "); 
        System.out.println("4. Dừng lại ");         
        int menu = input.nextInt();
       if( menu==1){
                HangThucPham tp = new HangThucPham();
                tp.nhapHangHoaThucPham();
                arr.add(tp);
                add();    
       }
       else if(menu== 2 ){
            HangDienMay dm = new HangDienMay();
                dm.nhapHangDienMay();
                arr.add(dm);
                add();
       }
       else if(menu ==3){
            HangSanhSu ss = new HangSanhSu();
                ss.nhapHangSanhSu();
                arr.add(ss);
                add();
       }
       else if(menu == 4){
           System.out.println("Tạm biệt ");   
        }
       else{
           add();
       }
    }
    public void find(String mh){
        if(arr.indexOf(mh) != -1){
            int a = arr.indexOf(mh);
            arr.get(a);
        }
           
    }
    public void sapxepTheoTen(){
        Collections.sort(arr, new Comparator<HangHoa>() {
            
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
               return o1.getTenHang().compareTo(o2.getTenHang());
            }
        });
    }
//    public void sapxepTonkho(){
//        Collections.sort(arr, new Comparator<HangHoa>() {
//            @Override
//            public int compare(HangHoa o1, HangHoa o2) {
//               return o2.getSoluongTon().compareTo(o2.getSoluongTon());
//            }
//        });
//    }
    
}
