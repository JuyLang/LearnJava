/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuDien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author KhuongDuy
 */
public class Dictionary {
    public static final int TU_KHOI_TAO = 1;
    // để tạo bên TuDienJPannel 
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
        danhSachCacTu.add(new Word(3, "Love", "Yêu"));
        danhSachCacTu.add(new Word(4, "In", "Vào"));
        danhSachCacTu.add(new Word(5, "Out", "Ra"));
        danhSachCacTu.add(new Word(6, "Hello", "Xin Chào"));
        danhSachCacTu.add(new Word(7, "War", "Chiến Tranh"));
        danhSachCacTu.add(new Word(8, "Start", "Bắt Đầu"));
        danhSachCacTu.add(new Word(9, "End", "Kết thúc"));
        danhSachCacTu.add(new Word(10, "Word", "Từ"));
        
    }
    
    public void sapXepList() {
        Collections.sort(danhSachCacTu, new WordComparator());
        // ta sắp xếp bằng cách gọi đến class WordComparator.
    }
    
    public int timKiemNhiPhan(String value) {
        sapXepList();
        // để thực hiện thuật toán nhị phân cần sắp xếp mảng theo thứ tự tăng dần
        // bởi vì: tại vì yêu cầu phải sắp xếp tăng dần mới thực hiện đc
        // Ta ví dụ mảng[left..right]
        int left = 0 , right = danhSachCacTu.size(), mid;
        int kq = - 1;
        // ta cho mid ở giữa = letf+rigt /2
        while(left < right) {
            mid = (left + right) / 2;
            Word wMid = danhSachCacTu.get(mid);
            if (wMid.getEn().equals(value)) {
                //so sánh thằng mid với giá trị ta nhập vào. 
                //nếu vào mid = nhập vào thì in ra vị trí mid luôn
                kq = mid; 
                break;
            }
            else if (wMid.getEn().compareToIgnoreCase(value)>0) {
                // Nếu x < arr[mid] thì chắc chắn x sẽ nằm ở phía bên trái tức là từ arr[left....mid]
                right = mid;
            }
            else {
                //Nếu x > arr[mid] thì chắc chắn x sẽ nằm ở phía bên phải mid tức là ở khoảng arr[mid+1...right].
                left = mid + 1;
            }
        }
        return kq;
    }    
    
    
    public static void main(String[] args) {
        new Dictionary();
    }
}
