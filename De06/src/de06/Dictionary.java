/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TrungCH
 */
public class Dictionary {
    public static final int TU_KHOI_TAO = 1;
     private ArrayList<Word> danhSachCacTu = new ArrayList<>();  
 
    public Dictionary() {
        boolean temp = false;
        int sl = 0;
        System.out.println("Bạn muốn nhập bao nhiều từ ");
        do {
             sl = Support.inputNumber();
            if (sl > 10) {
                temp = true;
            } else {
                System.out.println("Số lượng nhập phải >10");
            }
        } while (!temp);
        for(int i =0;i<sl;i++){
         danhSachCacTu.add(new Word());
        }
    }

    public ArrayList<Word> getDanhSachCacTu() {
        return danhSachCacTu;
    }

    public Dictionary(int tKT) {
        danhSachCacTu.add(new Word(1, "Dog", "Chó"));
        danhSachCacTu.add(new Word(2, "Cat", "Mèo"));
        danhSachCacTu.add(new Word(3, "Dictionary", "Từ Điển"));
        danhSachCacTu.add(new Word(4, "In", "Vào"));
        danhSachCacTu.add(new Word(5, "Out", "Ra"));
        danhSachCacTu.add(new Word(6, "History", "Lịch Sử"));
        danhSachCacTu.add(new Word(7, "Source", "Nguồn"));
        danhSachCacTu.add(new Word(8, "Start", "Bắt Đầu"));
        danhSachCacTu.add(new Word(9, "End", "Kết thúc"));
        danhSachCacTu.add(new Word(10, "Word", "Từ"));
        
    }
    
    public String timKiem(String a){
     for(Word temp: danhSachCacTu){
         if(a.equals(temp.getEn())){
            return temp.getVn();
         }
     }
     return "";
    }
    
    public static void main(String[] args) {
        new Dictionary();
    }
}
