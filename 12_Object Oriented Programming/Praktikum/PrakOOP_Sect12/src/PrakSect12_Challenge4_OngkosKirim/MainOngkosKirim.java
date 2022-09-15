/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrakSect12_Challenge4_OngkosKirim;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainOngkosKirim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OngkosKirim ongkosKirim = new OngkosKirim();

        Scanner input = new Scanner(System.in);


        //melakukan input data
        System.out.println("***Input****");
        System.out.print("Masukkan Panjang: ");
        int length = input.nextInt();
        ongkosKirim.setPanjang(length);

        System.out.print("Masukkan Lebar: ");
        int width = input.nextInt();
        ongkosKirim.setLebar(width);

        System.out.print("Masukkan Tinggi: ");
        int high = input.nextInt();
        ongkosKirim.setTinggi(high);

        ongkosKirim.batasDimensi();
        if (ongkosKirim.getBerat() <= 50){
            System.out.println("Berat: 1 kg");
        } else {
            System.out.println("Berat melebihi batas maksimal");
        }

        //Output
        System.out.println("*****Output******");
        if(ongkosKirim.getBerat() <= 50){
            System.out.println("Harga : Rp 5.000");
        } else {
            System.out.println("Harga : Rp 10.000");
        }
    }
    
}
