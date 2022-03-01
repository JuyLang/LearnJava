/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de01hanghoa;

import javax.swing.JFrame;

/**
 *
 * @author TrungCH
 */
public class De01HangHoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("Quan Li Dien Thoai");
        f.add(new QLHHJPanel());
        f.pack();
        f.setDefaultCloseOperation(3);
        f.setVisible(true);
    }
    
}
