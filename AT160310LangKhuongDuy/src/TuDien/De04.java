/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuDien;

import javax.swing.JFrame;

/**
 *
 * @author KhuongDuy
 */
public class De04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       JFrame f = new JFrame("Từ Điển Anh - Việt");
       f.add(new TuDienPanel()); // thêm pannel và Jframe
       f.setLocationRelativeTo(null); //đặt kích thước của cửa sổ
       f.setResizable(false); // không cho kéo khung ra
       f.pack(); //sẽ tự động thay đổi kích thước của JFrame dựa trên kích thước của các component 
       f.setDefaultCloseOperation(3);// là khung của ứng dụng
       f.setVisible(true); // hiển thị
    }
    
}
