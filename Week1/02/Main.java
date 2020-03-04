/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {
     public static void main(String[] args) {
         
        BangunDatar bangunDatar = new BangunDatar();
        BangunRuang bangunRuang = new BangunRuang();
        
        Persegi persegi = new Persegi();
        persegi.setSisi(4);
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJarijari(7);
        
        bangunDatar.hitungluas();
        persegi.hitungluas();
        lingkaran.hitungluas();
        
        Balok balok = new Balok();
        balok.setTinggi(10);
        balok.luas = persegi.luas;
        Tabung tabung = new Tabung();
        tabung.setTinggi(10);
        tabung.luas = lingkaran.luas;
        
        bangunRuang.hitungvolume();
        balok.hitungvolume();
        tabung.hitungvolume();
    }
}
