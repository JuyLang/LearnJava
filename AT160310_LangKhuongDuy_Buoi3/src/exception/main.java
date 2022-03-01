/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author langk
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sinhvien sv = new Sinhvien();
        try {
            sv.nhap();    
        } catch (Exception e) {
            System.err.println("Error: "+e);
        }
        finally{
            System.out.println(sv.toString());  
        }
        
    }
    
}
