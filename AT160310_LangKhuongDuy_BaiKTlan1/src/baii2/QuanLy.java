/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baii2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;


public class QuanLy {
    private ArrayList<HangHoa> DsHH;
    private Scanner sc = new Scanner(System.in);
    public QuanLy() {
    }

    public QuanLy(int n) {
        this.DsHH = new ArrayList<>(n);
    }
    public HangHoa getHangHoaByMa(String ma){
        for(HangHoa h: DsHH){
                if(h.getMahang().equalsIgnoreCase(ma)) return h;
        }
        return null;
    }
   public HangHoa nhapHangHoa(){
       String ma;
       while(true){
            try{
                System.out.println("Nhap ma hang");
                ma = sc.nextLine();
                if(ma.isEmpty()) throw new TrongException();
                //chua co -> null
                if(getHangHoaByMa(ma) == null){
                    System.out.println("Nhap ten hang");
                    String tenhang  = sc.nextLine();
                    if(tenhang.isEmpty()) tenhang = "xxx";
                    int slton, dongia;
                    System.out.println("Nhap so luong ton");
                    slton = Integer.parseInt(sc.nextLine());
                    if(slton<0) slton = 0;
                    System.out.println("Nhap don gia");
                    dongia = Integer.parseInt(sc.nextLine());
                    if(dongia<0) dongia = 0;
                    HangHoa h = new HangHoa(tenhang, tenhang, slton, dongia);
                    return h;
                }
                else{
                    System.err.println("Trung ma");
                }
                break;
            }
            catch(TrongException e){
                System.err.println("Khong de trong");
            }
       
       }
       return null;
   }
   public void nhapThucPham(){
       HangHoa h = nhapHangHoa();
       System.out.println("Nhap nha cung cap");
       String nhacc = sc.nextLine();
       System.out.println("Nhap ngay sx");
       String ngaysx = sc.nextLine();
       System.out.println("Nhap ngay het han");
       String ngayhh = sc.nextLine();
       
       HangThucPham htp = new HangThucPham(nhacc, ngaysx, ngayhh, h.getMahang(),h.getTenhang(),h.getSlton(),h.getDongia());
       DsHH.add(htp);
   }
   public void nhapDienMay(){
       HangHoa h = nhapHangHoa();
       System.out.println("Nhap thoi gian bao hanh");
       int tgbaohanh = Integer.parseInt(sc.nextLine());
       System.out.println("Nhap cong suat");
       int congsuat = Integer.parseInt(sc.nextLine());
       HangDienMay hdm = new HangDienMay(tgbaohanh, congsuat, h.getMahang(), h.getTenhang(), h.getSlton(), h.getDongia());
       DsHH.add(hdm);
   
   }
   public void nhapSanhSu(){
       HangHoa h = nhapHangHoa();
       System.out.println("Nhap nha sx");
       String nhasx = sc.nextLine();
       System.out.println("Nhap ngay nhap kho");
       String ngaynhap = sc.nextLine();
       HangSanhSu hss = new HangSanhSu(nhasx, ngaynhap, h.getMahang(), h.getTenhang(), h.getSlton(), h.getDongia());
       DsHH.add(hss);
   
   }
   public void inDS(){
       for(HangHoa h: DsHH){
           if(h==null) break;
           System.out.println(h);
           
       }
   }
   public void inTungLoai(){
       System.out.println("----------Danh sach hang dien may---------");
       for(HangHoa h: DsHH){
           if(h instanceof HangDienMay)System.out.println(h);
       }
       System.out.println("----------Danh sach hang sanh su---------");
       for(HangHoa h: DsHH){
           if(h instanceof HangSanhSu)System.out.println(h);
       }
       System.out.println("----------Danh sach hang thuc pham---------");
       for(HangHoa h: DsHH){
           if(h instanceof HangThucPham)System.out.println(h);
       }
   }
   public void timkiem(){
       System.out.println("Nhap ma can tim");
       String ma = sc.nextLine();
       HangHoa h = getHangHoaByMa(ma);
       if(h == null) System.out.println("Khong tim thay");
       else System.out.println(h);
   }
   public void sxTheoTenHang(){
       Collections.sort(DsHH, new Comparator<HangHoa>() {
           @Override
           public int compare(HangHoa o1, HangHoa o2) {
               return o1.getTenhang().compareToIgnoreCase(o2.getTenhang());
           }
       });
   }
   public void sxTheoSLTon(){
       Collections.sort(DsHH, new Comparator<HangHoa>() {
           @Override
           public int compare(HangHoa o1, HangHoa o2) {
               return o2.getSlton() - o1.getSlton();
           }
       });
   }
   public void xuatHTP(){
       for(HangHoa h: DsHH){
           if(h instanceof HangThucPham ){
               HangThucPham htp = (HangThucPham)h;
               if(htp.danhgia().equalsIgnoreCase("Kho ban"))
                   System.out.println(htp);
           }
       }
   }
    
}
