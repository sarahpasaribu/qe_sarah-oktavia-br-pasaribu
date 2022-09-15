/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrakSect12_Challenge2_Volume;

/**
 *
 * @author ASUS
 */
public class Balok {
    private int lebar;
    private int tinggi;
    private int panjang;

    //Menghitung Volume
    public int getVolume(int panjang, int lebar, int tinggi){
        return panjang*lebar*tinggi;
    }

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
}
