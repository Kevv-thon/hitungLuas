/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Pemilihan {
    static void pilih() {
        awalAkhir input = new awalAkhir();
        Input bangun = new Input();
        int punya;
        Scanner masuk = new Scanner(System.in);
        //User menginputkan disini
        System.out.print("Masukkan disini : ");
        punya = masuk.nextInt();  
        
        //Dari input user akan dipilih disini
        if(punya == 1) {
            bangun.Balok();
            System.out.println("Luas bangun balok : "+bangun.balok);
        } else if (punya == 2) {
            bangun.Kubus();
            System.out.print("Luas bangun kubus : "+bangun.kubus);
        } else if (punya == 3) {
            bangun.Bola();
            System.out.println("Luas bangun bola : "+bangun.bola);
        }
        
    }
    static void akhir() {
        System.out.println("");
    }
    
}
