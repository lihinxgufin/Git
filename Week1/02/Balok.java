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
public class Balok extends BangunRuang{
    float luas;
    private int t;
    
    void setTinggi(int t) {
        this.t = t;
    }
    public int getTinggi() {
        return t;
    }
    
    @Override
    float hitungvolume(){
        float volume = luas * getTinggi();
        System.out.println("Volume Balok: " + volume);
        return volume;
    }
}
