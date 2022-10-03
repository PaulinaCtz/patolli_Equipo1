/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dianey Elisa Velasquez Busani
 */
public class Tablero {
    List<Casilla> casillas = new ArrayList<Casilla>();
    
    public Tablero(){
        
    }

    public List<Casilla> getCasillas() {
        return casillas;
    }

    public void setCasillas(List<Casilla> casillas) {
        this.casillas = casillas;
    }
}
