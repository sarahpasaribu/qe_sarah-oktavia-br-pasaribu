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
public class MainLuasKeliling {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Persegi persegi = new Persegi();
        Segitiga segitiga = new Segitiga();
        PersegiPanjang persegiPanjang = new PersegiPanjang();

        System.out.println("*****LUAS********");
        System.out.println("Persegi = " + persegi.getLuas(4));
        System.out.println("Segitiga = " +segitiga.getLuas(3,4));
        System.out.println("Persegi Panjang = " +persegiPanjang.getLuas(7,8));

        System.out.println("*****KELILING*******");
        System.out.println("Persegi = " + persegi.getKeliling(4));
        System.out.println("Segitiga = " +segitiga.getKeliling(3,4));
        System.out.println("Persegi Panjang  " + persegiPanjang.getKeliling(7,8));
    }
    }
    

