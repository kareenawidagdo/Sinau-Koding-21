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
public class Persegi implements IBangundatar {
    int s;
    
    @Override
    public void luas(){
        int l = s*s;
        System.out.println("Luas Persegi adalah " + l + ".");
    }
    
    @Override
    public void keliling(){
        int k = 4*s;
        System.out.println("Keliling Persegi adalah " + k + ".");
    }
}
