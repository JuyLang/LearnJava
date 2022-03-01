/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2kiemtra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author langk
 */
public class Management {
    private int n;
    public ArrayList<Person> arr ;
    Scanner input = new Scanner(System.in);
    public Management(int n) {
        this.n = n;
        arr = new ArrayList<Person>(n);;
    }
 
    
    public void add(){
        System.out.println("-----------Menu-----------");
        System.out.println("1. Thêm sinh viên vào danh sách ");
        System.out.println("2. Thêm nhân viên vào danh sách ");
        System.out.println("3. Thêm đơn hàng công ty vào danh sách "); 
        System.out.println("4. Dừng lại ");         
        int menu = input.nextInt();
       if( menu==1){
            Student sv = new Student();
                sv.nhap();
                arr.add(sv);
                add();    
       }
       else if(menu== 2 ){
            Employee nv = new Employee();
                nv.nhap();
                arr.add(nv);
                add();
       }
       else if(menu ==3){
            Customer ct = new Customer();
                ct.nhap();
                arr.add(ct);
                add();
       }
       else if(menu == 4){
           System.out.println("Tạm biệt ");   
        }
       else{
           add();
       }
    }
    public void delete(){
            System.out.println("Nhập Tên cần xóa"); 
            String ten = input.nextLine();
            if (arr.contains(ten)) {
                arr.remove(arr.indexOf(ten));
                System.out.println("đã xóa");
            }
            else{
                System.out.println("Không có tên trong danh sách");
            }
                  
    }
    public void sapxep(){
        Collections.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
               return o1.getHoten().compareTo(o2.getHoten());
            }
        });
    }
  
}
