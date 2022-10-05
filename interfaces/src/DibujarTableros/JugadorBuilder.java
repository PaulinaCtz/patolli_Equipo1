/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DibujarTableros;

import objetosNegocio.Jugador;

/**
 *
 * @author 52644
 */
public abstract class JugadorBuilder {
    protected Jugador jugador;
    
    public Jugador getJugador(){
        return jugador;
    }
    public void crearNuevoJugador(){
        jugador = new Jugador();
    }
    
    public abstract void buildDinero();
}
