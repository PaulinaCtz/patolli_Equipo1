/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import java.awt.Color;
import objetosNegocio.Casilla;
import objetosNegocio.Jugador;

/**
 *
 * @author Paulina Cortez Alamilla.
 */
public class DirectorFicha {

    public void construirFichaAzul(BuilderFicha builder, int numeroFicha) {
        builder.setNumFicha(numeroFicha);
        builder.setJugador(new Jugador());
        builder.setCasilla(new Casilla());
        builder.setColor(Color.blue);
    }

    public void construirFichaVerde(BuilderFicha builder, int numeroFicha) {
        builder.setNumFicha(numeroFicha);
        builder.setJugador(new Jugador());
        builder.setCasilla(new Casilla());
        builder.setColor(Color.green);
    }

    public void construirFichaMorada(BuilderFicha builder, int numeroFicha) {
        builder.setNumFicha(numeroFicha);
        builder.setJugador(new Jugador());
        builder.setCasilla(new Casilla());
        builder.setColor(new Color(80, 13, 255));
    }

    public void construirFichaNaranja(BuilderFicha builder, int numeroFicha) {
        builder.setNumFicha(numeroFicha);
        builder.setJugador(new Jugador());
        builder.setCasilla(new Casilla());
        builder.setColor(Color.orange);
    }
}
