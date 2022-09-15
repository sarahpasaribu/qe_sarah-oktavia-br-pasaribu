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
public class MainVolume {
    public static void main(String[] args) {

        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        Tabung tabung = new Tabung();

        System.out.println("*******Volume*********");
        System.out.println("Kubus : " + kubus.getVolume(10) );
        System.out.println("Balok : " + balok.getVolume(3,6,10));
        System.out.println("Tabung : " + tabung.getVolume(7,10));
    }
}
