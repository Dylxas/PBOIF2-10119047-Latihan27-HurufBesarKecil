/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author Aldy
 */
public class PBOIF210119047Latihan27HurufBesarKecil {
    
    //convert Kapital
    public static String HurufBesar(String kalimat){
        String kalimatBesar = kalimat.toUpperCase();
        return kalimatBesar;
    }
    //convert biasa
    public static String HurufKecil(String kalimat){
        String kalimatKecil = kalimat.toLowerCase();
        return kalimatKecil;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = keyboard.nextLine();
        
        System.out.println("");
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Huruf Besar : " + HurufBesar(kalimat));
        System.out.println("Huruf Besar : " + HurufKecil(kalimat));
    }
    
}
