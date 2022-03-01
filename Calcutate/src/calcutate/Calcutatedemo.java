/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcutate;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author langk
 */
public class Calcutatedemo extends java.awt.Frame {

   

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     * @param s
     */
    private Container container;
    public Calcutatedemo(String s){
       super(s);
       container = this.getContentPane();
        JLabel lb1 = new JLabel("fisrt number");
        JTextField tf1 = new JTextField();
        JLabel lb2 = new JLabel("second number");
        JTextField tf2 = new JTextField();
        JLabel lb3 = new JLabel("result");
        JTextField tf3 = new JTextField();
        JPanel  panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3,2));
        panel1.add(lb1); 
        panel1.add(tf1); 
        panel1.add(lb2); 
        panel1.add(tf2);
        panel1.add(lb3);
        panel1.add(tf3);
        
        
        JButton btn1 = new JButton("+");
        JButton btn2 = new JButton("-");
        JButton btn3 = new JButton("*");
        JButton btn4 = new JButton("/");
        JPanel panel2 = new JPanel();
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.add(btn4);
        container.add(panel1); 
        container.add(panel2,"South");
        this.setSize(500, 500);
        this.setVisible(true);
    }
    private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
