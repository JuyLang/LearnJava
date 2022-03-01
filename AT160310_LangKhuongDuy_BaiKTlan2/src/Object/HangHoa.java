/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author langkduy
 */
public class HangHoa extends  SieuThi{
    private ArrayList<HangHoa> list = new ArrayList<>();
    private String tenHangHoa,donViTinh;
    private int donGia, soLuong;

    public HangHoa() {
    }

    public HangHoa(String soHoadon, String ngayHoaDon, int soLuongHangHoa) {
        super(soHoadon, ngayHoaDon, soLuongHangHoa);
    }

    public HangHoa(String tenHangHoa, String donViTinh, int donGia, int soLuong) {
        this.tenHangHoa = tenHangHoa;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public HangHoa(String tenHangHoa, String donViTinh, int donGia, int soLuong, String soHoadon, String ngayHoaDon, int soLuongHangHoa) {
        super(soHoadon, ngayHoaDon, soLuongHangHoa);
        this.tenHangHoa = tenHangHoa;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

   

    

    public ArrayList<HangHoa> getList() {
        return list;
    }

    public void setList(ArrayList<HangHoa> list) {
        this.list = list;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public float getThanhTien(){
        
        return donGia*soLuong;
        
    }
    public void add(HangHoa hh){
        list.add(hh);
    }
    public  void renderToTable(DefaultTableModel tblModel){
        tblModel.setRowCount(0);
        for (HangHoa hangHoa : list) {
            Object[] row = new Object[]{hangHoa.getTenHangHoa(),
                hangHoa.getDonViTinh(),hangHoa.getDonGia(),hangHoa.getSoLuong(),
                hangHoa.getThanhTien()
            };
            tblModel.addRow(row);
        }
        tblModel.fireTableDataChanged();
    }
    
}
