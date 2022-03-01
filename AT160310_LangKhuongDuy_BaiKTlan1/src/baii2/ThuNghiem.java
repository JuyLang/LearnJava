/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baii2;

import java.util.Scanner;

public class ThuNghiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        QuanLy ql = new QuanLy(Integer.parseInt(sc.nextLine()));
        while(true){
            System.out.println("-------Menu------");
            System.out.println("0.Thoat");
            System.out.println("1. Them hang thuc pham");
            System.out.println("2. Them hang sanh su");
            System.out.println("3. Them hang dien may");
            System.out.println("4. In toan bo danh sach");
            System.out.println("5. In tung loai hang");
            System.out.println("6. Sap xep hang hoa theo ten tang dan");
            System.out.println("7. Sap xep hang hoa theo so luong ton tang dan");
            System.out.println("8. Xuat cac hang thuc pham kho ban");
            int chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 0:
                    System.exit(0);
                case 1:
                    ql.nhapThucPham();
                    break;
                case 2: 
                    ql.nhapSanhSu();
                    break;
                case 3:
                    ql.nhapDienMay();
                    break;
                case 4:
                    ql.inDS();
                    break;
                case 5:
                    ql.inTungLoai();
                    break;
                case 6:
                    ql.timkiem();
                    break;
                case 7:
                    ql.sxTheoTenHang();
                    break;
                case 8:
                    ql.xuatHTP();
                    break;
                    
            }
        }
    }
}
