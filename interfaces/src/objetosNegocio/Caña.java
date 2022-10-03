/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

/**
 *
 * @author Dianey Elisa Velasquez Busani - 00000228270
 */
public class Caña {
    int numCaña;
    boolean lado;

    public Caña() {
    }

    public Caña(int numCaña, boolean lado) {
        this.numCaña = numCaña;
        this.lado = lado;
    }

    public int getNumCaña() {
        return numCaña;
    }

    public void setNumCaña(int numCaña) {
        this.numCaña = numCaña;
    }

    public boolean isLado() {
        return lado;
    }

    public void setLado(boolean lado) {
        this.lado = lado;
    }
    
}
