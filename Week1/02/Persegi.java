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
    private int s;
    float luas;
    
    void setSisi(int s) {
        this.s = s;
    }
    public int getSisi() {
        return s;
    }
    
    @Override
    float hitungLuas(){
        luas = getSisi() * getSisi();
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }
}
