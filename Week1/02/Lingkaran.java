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
public class Lingkaran extends BangunDatar{
    private int r;
    float luas;
    
    void setJarijari(int r) {
        this.r = r;
    }
    public int getJarijari() {
        return r;
    }
    
    @Override
    float hitungluas(){
        luas = (float) (Math.PI * getJarijari() * getJarijari());
        System.out.println("Luas Lingkaran: " + luas);
        return luas;
    }
}
