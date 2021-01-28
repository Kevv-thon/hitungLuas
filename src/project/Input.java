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
public class Input {
    int pbalok;
    int lbalok;
    int tbalok;
    int balok;
    int skubus;
    int kubus;
    double rbola;
    double bola;
    Scanner input = new Scanner(System.in);
    
    void Balok(){
        //Input data untuk penghitungan balok
        System.out.println("");
        System.out.print("Masukkan panjang balok : ");
        pbalok = input.nextInt();
        System.out.print("Masukkan lebar balok : ");
        lbalok = input.nextInt();
        System.out.print("Masukkan tinggi balok : ");
        tbalok = input.nextInt();
        
        //perhitungan dari data balok
        balok = 2 * ((pbalok * tbalok) + (pbalok * lbalok) + (lbalok * tbalok));
    }
    void Kubus() {
        //Input data untuk penghitungan kubus
        System.out.println("");
        System.out.print("Masukkan sisi kubus : ");
        skubus = input.nextInt();
        
        //perhitungan dari data kubus
        kubus = 6 *(skubus * skubus);
    }
    void Bola() {
        //Input data untuk penghitungan bola
        System.out.println("");
        System.out.print("Masukkan jari-jari bola : ");
        rbola = input.nextDouble();
        
        //perhitungan dari data bola
        bola = 4 * Math.PI * (rbola * rbola);
    }
}
