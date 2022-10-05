/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package builder;

import java.awt.Color;
import objetosNegocio.Casilla;
import objetosNegocio.Jugador;

/**
 *
 * @author Paulina Cortez Alamilla.
 */
public interface BuilderFicha {
    
    void setNumFicha(int numFicha);
    void setJugador (Jugador jugador);
    void setCasilla (Casilla casilla);
    void setColor (Color color);
}
