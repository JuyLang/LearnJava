/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de02xeploaidiem;

import javax.swing.JFrame;

/**
 *
 * @author TrungCH
 */
public class De02XepLoaiDiem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new QLSV());
        f.setDefaultCloseOperation(3);
        f.pack();
        f.setVisible(true);
    }
    
}
