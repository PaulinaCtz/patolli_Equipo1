/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import java.awt.Color;
import objetosNegocio.Casilla;
import objetosNegocio.Ficha;
import objetosNegocio.Jugador;

/**
 *
 * @author Paulina Cortez Alamilla.
 */
public class FichaBuilder implements BuilderFicha {
    
    private int numFicha;
    private Jugador jugador; 
    private Casilla casilla; 
    private Color color;
    
    @Override
    public void setNumFicha(int numFicha) {
        this.numFicha = numFicha;
    }

    @Override
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
    
    public Ficha resultado(){
        return new Ficha(numFicha, jugador, casilla, color);
    }
}
