/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuDien;

import java.util.Comparator;

/**
 *
 * @author KhuongDuy
 */
public class WordComparator implements Comparator<Word>{
    
    @Override
    public int compare(Word o1, Word o2) {
        // tham khảo StackOverFolow
        // truyền 2 thằng vào 01,02
        return o1.getEn().compareToIgnoreCase(o2.getEn());
        // lấy ra 2 giá trị của nó. Sau khi so sánh thì tự sắp xếp theo aplaAB
    }
    
}
