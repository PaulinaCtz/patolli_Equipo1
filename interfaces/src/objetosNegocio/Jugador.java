/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Dianey Elisa Velasquez Busani - 00000228270
 */
public class Jugador {
    
    float dinero;
    Ficha fichas;
    
    public Jugador(){
        
    }

    public Jugador(float dinero, Ficha fichas) {
        this.dinero = dinero;
        this.fichas = fichas;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public Ficha getFichas() {
        return fichas;
    }

    public void setFichas(Ficha fichas) {
        this.fichas = fichas;
    }
    
    

    
}
