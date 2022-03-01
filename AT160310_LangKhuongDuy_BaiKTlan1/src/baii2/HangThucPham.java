/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baii2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham extends HangHoa implements IHangHoa{
    private String nhacc, ngaysx, ngayhh;

    public HangThucPham() {
    }

    public HangThucPham(String nhacc, String ngaysx, String ngayhh, String mahang, String tenhang, int slton, int dongia) {
        super(mahang, tenhang, slton, dongia);
        this.nhacc = nhacc;
        setNgaysx(ngaysx);
        setNgayhethan(ngayhh);
    }
     public String check(){
        Date dhtai = new Date();
        Date dhethan = new Date(ngayhh);
        if(dhethan.after(dhtai)) return "";
        else return "Hang het han";
    }
     
    public void setNgaysx(String ngaysx) {
        Date d = new Date();//lay ngay gio hien tai
        Date dsx = new Date(ngaysx);
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String ngayhtai = f.format(d);
        if(dsx.before(d)) this.ngaysx = ngaysx; //nhap vao
        else this.ngaysx = ngayhtai; //mac dinh
    }

    public void setNgayhethan(String ngayhethan) {
        Date dhethan = new Date(ngayhethan); 
        Date dsx = new Date(ngaysx);
        if(dhethan.after(dsx))this.ngayhh = ngayhethan;
        else this.ngayhh = ngaysx;
        this.ngayhh = ngayhethan;
    }
    @Override
    public double tinhVAT() {
        return 0.05;
    }

    @Override
    public String danhgia() {
        if(getSlton() > 0 && check().equals("Hang het han") ) return "Kho ban";
        else return "Khong danh gia";
    }
    @Override
    public String toString(){
        return super.toString()+"\t"+nhacc+"\t"+ngaysx+"\t"+ngayhh+"\t"+danhgia();
    }
}
