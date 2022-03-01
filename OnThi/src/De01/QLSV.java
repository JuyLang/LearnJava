/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.jws.Oneway;

/**
 *
 * @author langk
 */
public class QLSV {
    private ArrayList<Student> DsSV;

    public QLSV() {
    }
    
    public QLSV(int n) {
        this.DsSV = new ArrayList<>(n);
    }
    
    public void nhap(){
        for (int i = 0; i < DsSV.size(); i++) {
            Student sv = new Student();
            sv.nhap();
            DsSV.add(sv);
        }
        
    }
    
    public Student Find(String check){
        for (Student h : DsSV) {
            if(h.getMaSV() == null ? check == null : h.getMaSV().equals(check)){
                return h;
            }
            else{
               return null;
            }           
        }
        return null;
     }
    
    // sắp xếp

    /**
     *
     */
    public void SapXepTheoTen(){
         Collections.sort(DsSV, new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               return o1.getHoTen().compareToIgnoreCase(o2.getHoTen());
           }
       });
     }
    
    
}
