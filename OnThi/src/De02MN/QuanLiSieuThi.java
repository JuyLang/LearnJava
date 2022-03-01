/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De02MN;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author langk
 */
public class QuanLiSieuThi {
    private ArrayList<KhoSieuThi> Kho;
    private ArrayList<KhachHang> Khach;

    public QuanLiSieuThi() {
    }

    public QuanLiSieuThi(ArrayList<KhoSieuThi> Kho, ArrayList<KhachHang> Khach) {
        this.Kho = new ArrayList<>();
        this.Khach = new ArrayList<>();
    }
    
    public void Menu(){
        Scanner input = new Scanner(System.in);
        
        boolean chose = true;
        while(chose) {            
            System.out.println("Menu: ");
            System.out.println("1: Thêm sản phẩm vào siêu thị");
            System.out.println("2: Siêu thị thêm khách hàng ");
            System.out.println("3: Thay đổi thông tin sản phẩm ");
            System.out.println("4: In sản phẩm của siêu thị");
            System.out.println("5: In sản phẩm và số tiền của khách hàng:");
            System.out.println("6: Hiển thị khách hàng chi tiêu nhiều nhất:");
            System.out.println("7 - Hoặc bất kỳ : Thoát");
            int chon = input.nextInt();
            switch (chon) {
                case 1:
                    addSP();
                    break;
                case 2:
                    themKH();
                    break;
                case 3:
                    thaydoiTTSP();
                    break;
                case 4:
                    inSP();
                    break;
                case 5:
                    inTienSPKH();
                    break;
                case 6:
                    inKHmax();
                    break;
                case 7:
                    chose = false;
                    break;
                default:
                    chose = false;
                    break;
            }                
        }
        
    }


    private void themKH() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void thaydoiTTSP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void inSP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void inTienSPKH() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void inKHmax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
