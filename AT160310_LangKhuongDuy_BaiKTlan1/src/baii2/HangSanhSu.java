/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baii2;

public class HangSanhSu extends HangHoa implements IHangHoa{
    private String nhasx, ngaynhap;

    public HangSanhSu() {
    }

    public HangSanhSu(String nhasx, String ngaynhap, String mahang, String tenhang, int slton, int dongia) {
        super(mahang, tenhang, slton, dongia);
        this.nhasx = nhasx;
        this.ngaynhap = ngaynhap;
    }
    
    
    public double tinhVAT(){
        return 0.1;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\t"+ nhasx+"\t"+ ngaynhap+"\t"+ danhgia();
    }

    @Override
    public String danhgia() {
        if(getSlton()>50) return ("Ban cham");
        else return "Khong danh gia";
    }
    
}
