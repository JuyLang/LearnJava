/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de06ucln;

import javax.swing.JFrame;

/**
 *
 * @author TrungCH
 */
public class De06UCLN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("Phan So");
        f.add(new UCLNJPanel());
        f.pack();
        f.setDefaultCloseOperation(3);
        f.setVisible(true);
    }
    
}
