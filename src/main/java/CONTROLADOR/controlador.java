/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.modelo;
import VISTA.FormVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DONALD
 */
public class controlador implements ActionListener{
    
    private FormVista vis;
    private modelo mo;
    
    public controlador(FormVista vis, modelo mo){
        this.vis=vis;
        this.mo=mo;
        this.vis.btnObtener.addActionListener(this);
    }
    
    public void inicio(){
        vis.setTitle("Ejemplo MVC");
        vis.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        mo.setPeso(Integer.parseInt(vis.txtPeso.getText()));
        mo.setAltura(Integer.parseInt(vis.txtAltura.getText()));
        mo.calcular();
        vis.txtIMC.setSelectionEnd(mo.getIMC());
    }  
}

