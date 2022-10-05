/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DibujarTableros;

import interfaces.Tablero;
import javax.swing.Icon;

/**
 *
 * @author 52644
 */
public class DatosJugador {
    public void dibujarFichasJugador(){
        Icon uno = new javax.swing.ImageIcon(getClass().getResource("../img/ficha1.png"));
        Icon dos = new javax.swing.ImageIcon(getClass().getResource("../img/ficha1.png"));
        Tablero.ficha1.setIcon(uno);
        Tablero.ficha2.setIcon(dos);
    }
}
