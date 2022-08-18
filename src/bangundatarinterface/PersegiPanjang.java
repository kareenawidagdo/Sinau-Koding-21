/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatarinterface;

/**
 *
 * @author Dell
 */
public class PersegiPanjang implements IBangundatar {
    int p;
    int l;
    
    @Override
    public void luas(){
        int luas = p*l;
        System.out.println("Luas Persegi Panjang adalah " + luas + ".");
    }
    
    @Override
    public void keliling(){
        int k = (2*p)+(2*l);
        System.out.println("Keliling Persegi Panjang adalah " + k + ".");
    }
}
