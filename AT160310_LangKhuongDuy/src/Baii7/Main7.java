/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baii7;

/**
 *
 * @author langk
 */
public class Main7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        PhanSo cong;
        PhanSo hieu;
        PhanSo chia;
        PhanSo tich;
        PhanSo nghichDao;
        PhanSo doiDau;
        System.out.println("Phân Số đầu tiên");
        a.nhap();
        a.print();
        System.out.println("Phân Số Thứ 2");
        b.nhap();
        b.print();
        cong = a.Cong(b);
        hieu = a.Tru(b);
        chia = a.chia(b);
        tich = a.nhan(b);
        nghichDao = a.nghichDao(b);
        doiDau = a.DoiDau(b);
        System.out.println("tổng hai phân số ");
        cong.print();
        System.out.println("hiệu hai phân số ");
        hieu.print();
        System.out.println("thương hai phân số ");
        chia.print();
         System.out.println("tích hai phân số ");
        tich.print();
         System.out.println("nghịch đảo số thứ nhất");
        nghichDao.print();
        System.out.println("đổi dấu số thứ nhất");
        doiDau.print();
        a.soSanhBang(b);
        a.lonHon(b);
        a.nhoHon(b);
    }
    
}
