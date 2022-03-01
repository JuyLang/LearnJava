/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docluufiletext;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TrungCH
 */
public class DocLuuFileText {

    /**
     * @param args the command line arguments
     */
    private ArrayList<SinhVien> danhSachSV = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        DocLuuFileText d = new DocLuuFileText();
//       d.themSV();
//       d.luuFileText();
        d.docFileText();
        for (SinhVien sv : d.danhSachSV) {
            System.out.println(sv.getMaSV() + "  " + sv.getHoTen() + "  " + sv.getNamSinh() + "  " + sv.getGioiTinh() + "  " + sv.getDiemTB());
        }
    }

    public void themSV() {
        String maSV;
        String hoTen;
        int namSinh;
        String gioiTinh;
        float diemTB;
        Scanner sc = new Scanner(System.in);
        System.out.println("ban muon nhap bn sv???");
        int sl = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < sl; i++) {
            System.out.println("MaSV: ");
            maSV = sc.nextLine();
            System.out.println("HoTen: ");
            hoTen = sc.nextLine();
            System.out.println("NamSinh : ");
            namSinh = Integer.parseInt(sc.nextLine());
            System.out.println("GioiTinh:");
            gioiTinh = sc.nextLine();
            System.out.println("DiemTB: ");
            diemTB = Float.parseFloat(sc.nextLine());
            danhSachSV.add(new SinhVien(maSV, hoTen, namSinh, gioiTinh, diemTB));
        }
    }

    public void luuFileText() {

        try {
            FileOutputStream fos = new FileOutputStream("D:/sv.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);

            for (SinhVien sv : danhSachSV) {
                bw.write(sv.getMaSV() + "$" + sv.getHoTen() + "$" + sv.getNamSinh() + "$" + sv.getGioiTinh() + "$" + sv.getDiemTB());
                bw.newLine();
            }
            System.out.println("luu thanh cong");
            bw.close();
            osw.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void docFileText() {
        try {
            FileInputStream fis = new FileInputStream("D:/sv.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            while (line != null) {
                String[] thongTin = line.split("\\$");
                SinhVien sv = new SinhVien(thongTin[0], thongTin[1], Integer.parseInt(thongTin[2]), thongTin[3], Float.parseFloat(thongTin[4]));
                danhSachSV.add(sv);
                line = br.readLine();
            }
            br.close();
            isr.close();
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
