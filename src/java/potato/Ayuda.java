/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potato;

/**
 *
 * @author daw206
 */
public class Ayuda {
    
    private String ayuda= "esto es una ayuda";
    
    private int n= 666;

    public String getAyuda() {
        return ayuda;
    }

    public void setAyuda(String ayuda) {
        this.ayuda = ayuda;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void pedirAyuda () {
        System.out.println(ayuda + " " + n);
    }

    @Override
    public String toString() {
        return "Ayuda{" + "ayuda=" + ayuda + ", n=" + n + '}';
    }
    
    
}
