/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author LENOVO
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        awalAkhir panggil = new awalAkhir();
        Input jalan = new Input();
        
        System.out.println(panggil.awal());
        panggil.pilih();
        Pemilihan.pilih();
        Pemilihan.akhir();
        System.out.println(panggil.akhir());
        
    }
    
}
