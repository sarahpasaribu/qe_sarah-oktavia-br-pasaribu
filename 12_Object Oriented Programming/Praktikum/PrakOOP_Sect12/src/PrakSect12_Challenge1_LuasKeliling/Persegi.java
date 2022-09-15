package PrakSect12_Challenge1_LuasKeliling;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class Persegi {
    private int sisi;
    
     //Luas
    public int getLuas(int sisi){
        return sisi*sisi;
    }

    //Keliling
    public int getKeliling(int sisi){
        return 4*sisi;
    }

    //Setter
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    //Getter
    public int getSisi() {
        return sisi;
    }
}
