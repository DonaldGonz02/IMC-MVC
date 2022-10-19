/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mvc.imc;

import CONTROLADOR.controlador;
import MODELO.modelo;
import VISTA.FormVista;

/**
 *
 * @author DONALD
 */
public class MVCIMC {

    public static void main(String[] args) {
        modelo modelo= new modelo();
        FormVista vista = new FormVista();
        controlador control = new controlador(vista, modelo);
        control.inicio();
        vista.setVisible(true);
    }
}
