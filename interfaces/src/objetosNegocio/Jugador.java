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
public class Jugador {
    
    private float dinero;
    private Ficha[] fichas;
    private Tablero tablero; 
    private Caña[] cañas;
    private Apuesta[] apuestas;
    
    public Jugador(){
        
    }

    public Jugador(float dinero, Ficha[] fichas) {
        this.dinero = dinero;
        this.fichas = fichas;
    }

    public Jugador(float dinero, Ficha[] fichas, Tablero tablero, Caña[] cañas, Apuesta[] apuestas) {
        this.dinero = dinero;
        this.fichas = fichas;
        this.tablero = tablero;
        this.cañas = cañas;
        this.apuestas = apuestas;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public Ficha[] getFichas() {
        return fichas;
    }

    public void setFichas(Ficha[] fichas) {
        this.fichas = fichas;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Caña[] getCañas() {
        return cañas;
    }

    public void setCañas(Caña[] cañas) {
        this.cañas = cañas;
    }

    public Apuesta[] getApuestas() {
        return apuestas;
    }

    public void setApuestas(Apuesta[] apuestas) {
        this.apuestas = apuestas;
    }
}
