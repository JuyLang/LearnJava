/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author langk
 */
public class BT_TryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int tuoi = nhapTuoiNhanVien();
            System.out.println("Tuổi đã nhập: " + tuoi);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     private static int nhapTuoiNhanVien() throws AgeCheckingException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Hãy nhập tuổi nhân viên: ");
    int tuoi = 0;
    try {
        tuoi = scanner.nextInt();
        if (tuoi < 0) throw new AgeCheckingException("tuổi không được nhỏ hơn 0.");
    } catch (InputMismatchException e) {
    throw new AgeCheckingException("tuổi phải là một số.");
    }
        return tuoi;
    }
    
}
