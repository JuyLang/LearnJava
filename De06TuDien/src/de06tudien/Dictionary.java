/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de06tudien;

import java.util.ArrayList;

/**
 *
 * @author TrungCH
 */
public class Dictionary {
    public static final int TU_KHOI_TAO = 1;
    protected ArrayList<Word> danhSachTu = new ArrayList<>();

    public Dictionary(int tkt) {
        danhSachTu.add(new Word(1,"Dog","Cho"));
        danhSachTu.add(new Word(2,"Cat","Meo"));
        danhSachTu.add(new Word(3,"In","Vao"));
        danhSachTu.add(new Word(4,"Out","Ra"));
        danhSachTu.add(new Word(5,"Source","Nguon"));
        danhSachTu.add(new Word(6,"Dictionary","Tu Dien"));
        danhSachTu.add(new Word(7,"Math","Toan"));
        danhSachTu.add(new Word(8,"History","Lich Su"));
        danhSachTu.add(new Word(9,"Word","Tu"));
        danhSachTu.add(new Word(10,"Pen","But"));
        danhSachTu.add(new Word(11,"Start","Bat Dau"));
    }

    public ArrayList<Word> getDanhSachTu() {
        return danhSachTu;
    }  

 
    
  public String timKiem(String name){
   for(Word w : danhSachTu){
      if(name.equals(w.getEn())){
         return w.getVn();
      }
   }
   return "";
  }
}
