/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.awt.Color;

/**
 *
 * @author Dianey Elisa Velasquez Busani - 00000228270
 */
public class Ficha {
    private int numFicha;
    private Jugador jugador;
    private Casilla casilla;
    private Color color;

    public Ficha() {
        
    }
    public Ficha(int numFicha, Jugador jugador, Casilla casilla) {
        this.numFicha = numFicha;
        this.jugador = jugador;
        this.casilla = casilla;
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

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    public Color getColor() {
        return color;
    }

    public void setColor() {
        this.color = jugador.getColor();
    }
    
}
