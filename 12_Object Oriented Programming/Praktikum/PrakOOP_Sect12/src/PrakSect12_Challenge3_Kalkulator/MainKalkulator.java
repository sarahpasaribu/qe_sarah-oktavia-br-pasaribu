/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrakSect12_Challenge3_Kalkulator;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class MainKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kalkulator = new Kalkulator();

        Scanner input = new Scanner(System.in);
        boolean lanjut = true;
        int pilihan, hasil=0;

        while (lanjut == true){
            System.out.println("*******************************");
            System.out.println("Program Kalkulator Sederhana");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Exit");
            System.out.println("********************************");

            //Memilih Operasi yang ada
            System.out.print("Silahkan Pilih Operasi : ");
            pilihan = input.nextInt();

            //Input data
            System.out.print("Masukkan Bilangan Pertama: ");
            int numbers1 = input.nextInt();
            kalkulator.setBilangan1(numbers1);

            System.out.print("Masukkan Bilangan Kedua: ");
            int numbers2 = input.nextInt();
            kalkulator.setBilangan2(numbers2);

            //Switch Case
            switch (pilihan){
                case 1 : {
                    kalkulator.penjumlahan();
                    System.out.println("Maka Hasil Penjumlahan : " + kalkulator.getHasil());
                    break;
                }
                case 2 : {
                    kalkulator.pengurangan();
                    System.out.println("Maka Hasil Pengurangan : " + kalkulator.getHasil());
                    break;
                }
                case 3 : {
                    kalkulator.perkalian();
                    System.out.println("Maka Hasil Perkalian : " + kalkulator.getHasil());
                    break;
                }
                case 4 : {
                    kalkulator.pembagian();
                    System.out.println("Maka Hasil Pembagian : " + kalkulator.getHasil());
                    break;
                }
                default : {
                    lanjut = false;
                    System.out.println("Input yang anda masukkan salah & Program Stopped");
                }
            }

        }
    }
    
}
