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
public class PersegiPanjang {
    private int panjang;
    private int lebar;

    //Luas
    public int getLuas(int panjang, int lebar){
        return panjang*lebar;
    }

    //Keliling
    public int getKeliling(int panjang, int lebar){
        return 2*(panjang + lebar);
    }

    //Setter
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    //Getter
    public int getLebar() {
        return lebar;
    }

    public int getPanjang() {
        return panjang;
    }
}
