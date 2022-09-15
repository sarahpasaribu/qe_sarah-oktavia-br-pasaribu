/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrakSect12_Challenge4_OngkosKirim;

/**
 *
 * @author ASUS
 */
public class OngkosKirim {
    private int panjang;
    private int lebar;
    private int tinggi;
    private int berat;

    //Method dengan Setter
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public void setBerat(int berat) {
        this.berat = berat;
    }

    //Method dengan Getter
    public int getPanjang() {
        return panjang;
    }
    public int getLebar() {
        return lebar;
    }
    public int getTinggi() {
        return tinggi;
    }
    public int getBerat() {
        return berat;
    }

    //Method 
    public void batasDimensi(){
        this.berat = panjang*lebar*tinggi;
    }
}
