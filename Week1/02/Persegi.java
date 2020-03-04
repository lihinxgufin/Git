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
public class Persegi extends BangunDatar{
    private int sisi;
    float luas;
    
    void setSisi(int sisi) {
        this.sisi = sisi;
    }
    public int getSisi() {
        return sisi;
    }
    
    @Override
    float hitungluas(){
        luas = getSisi() * getSisi();
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }
}
