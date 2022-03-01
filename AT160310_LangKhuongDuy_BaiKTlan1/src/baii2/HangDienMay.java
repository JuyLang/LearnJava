/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baii2;


public class HangDienMay extends HangHoa implements IHangHoa{
    private int tgbaohanh, congsuat;

    public HangDienMay() {
    }

    public HangDienMay(int tgbaohanh, int congsuat, String mahang, String tenhang, int slton, int dongia) {
        super(mahang, tenhang, slton, dongia);
        this.tgbaohanh = tgbaohanh;
        this.congsuat = congsuat;
    }
    public String toString(){
        return toString()+"\t"+tgbaohanh+"\t"+congsuat+"\t"+ danhgia();
    }

    @Override
    public double tinhVAT() {
        return 0.1;
    }

    @Override
    public String danhgia() {
//        if(getSlton()<3) return "Ban duoc";
        return "Khong danh gia";
                
    }
}
