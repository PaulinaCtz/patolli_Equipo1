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
public class Ficha {
    int numFicha;
    Jugador jugador;

    public Ficha(int numFicha, Jugador jugador) {
        this.numFicha = numFicha;
        this.jugador = jugador;
    }

    public Ficha() {
    }

    public int getNumFicha() {
        return numFicha;
    }

    public void setNumFicha(int numFicha) {
        this.numFicha = numFicha;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
}
