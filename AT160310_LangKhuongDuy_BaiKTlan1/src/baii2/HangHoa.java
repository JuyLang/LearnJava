package baii2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class HangHoa {
    private String mahang, tenhang;
    private int slton;
    private int dongia;

    public HangHoa() {
    }

    public HangHoa(String mahang, String tenhang, int slton, int dongia) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.slton = slton;
        this.dongia = dongia;
    }

    public String getMahang() {
        return mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public int getSlton() {
        return slton;
    }

    public void setSlton(int slton) {
        this.slton = slton;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
    
    public String toString(){
        return mahang+"\t"+tenhang+"\t"+slton+"\t"+dongia;
    }
    
}
