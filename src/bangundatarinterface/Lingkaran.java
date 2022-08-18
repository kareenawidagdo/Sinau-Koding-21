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
public class Lingkaran implements IBangundatar {
    double r;
    
    @Override
    public void luas(){
        double l = 3.14*r*r;
        System.out.println("Luas Lingkaran adalah " + l + ".");
    }
    
    @Override
    public void keliling(){
        double k = 2*3.14*r;
        System.out.println("Keliling Lingkaran adalah " + k + ".");
    }
}
