/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

import DibujarTableros.Cañas;
import interfaces.Tablero;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author 52644
 */
public class Escenarios {
    public void ingresarFicha(Graphics g){
        int suma = Cañas.suma;
        if(suma>0){
            Icon blanco = new javax.swing.ImageIcon(getClass().getResource("../img/fondoBlanco.png"));
            Tablero.ficha1.setIcon(blanco);
            ImageIcon fichaIngresada=new ImageIcon(getClass().getResource("../img/ficha1.png"));
            g.drawImage(fichaIngresada.getImage(), 415, 200,null);
        }
    }
}
