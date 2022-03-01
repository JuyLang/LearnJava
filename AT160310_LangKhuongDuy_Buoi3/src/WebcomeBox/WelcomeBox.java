/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebcomeBox;

import javax.swing.JOptionPane;

/**
 *
 * @author langk
 */
public class WelcomeBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ketqua = Math.random();
        ketqua = ketqua*100;
        if(ketqua >=50){
            JOptionPane.showMessageDialog(null, "You win", "Lucky Number", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "You lost ", "Lucky Number", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
