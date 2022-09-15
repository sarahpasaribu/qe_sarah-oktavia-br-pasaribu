/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrakSect12_Challenge1_LuasKeliling;

/**
 *
 * @author ASUS
 */
public class Segitiga {
     private int alas;
    private int tinggi;

    //Luas
    public int getLuas(int alas, int tinggi){
        return (alas*tinggi)/2;
    }

    //Keliling
    public int getKeliling(int alas, int tinggi){
        return alas*tinggi;
    }

    //Setter
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    //Getter
    public int getAlas() {
        return alas;
    }
    public int getTinggi() {
        return tinggi;
    }
}
