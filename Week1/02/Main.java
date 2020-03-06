/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun;

/**
 *
 * @author lenovo
 */
public class Main {
     public static void main(String[] args) {
        
        Persegi persegi = new Persegi();
        persegi.setSisi(4);
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJarijari(7);
        
        persegi.hitungLuas();
        lingkaran.hitungLuas();
        
        Balok balok = new Balok();
        balok.setTinggi(10);
        balok.luas = persegi.luas;
        Tabung tabung = new Tabung();
        tabung.setTinggi(10);
        tabung.luas = lingkaran.luas;
        
        balok.hitungVolume();
        tabung.hitungVolume();
    }
}
