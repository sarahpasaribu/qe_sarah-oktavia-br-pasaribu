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
public class Kubus {
    private int sisi;

    //Volume
    public int getVolume(int sisi){
        return sisi*sisi*sisi;
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
