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
public class Tabung {
     private int jarijari;
    private int tinggi;

    //Mencari Volume
    public int getVolume(int jarijari, int tinggi){
        return (int) Math.ceil(Math.PI * jarijari * jarijari * tinggi);
    }

    //Method dengan Setter
    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    //Method dengan Getter
    public int getJarijari() {
        return jarijari;
    }
    public int getTinggi() {
        return tinggi;
    }
}
