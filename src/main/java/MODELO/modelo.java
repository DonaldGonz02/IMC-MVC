/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author DONALD
 */
public class modelo {
    
   private double peso;
   private double altura;
   private double  IMC;
   private double dato;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public double getDato() {
        return dato;
    }

    public void setDato(double dato) {
        this.dato = dato;
    }

   
   
   //método del botón Calcular IMC
    public double calcular(){
        
        dato = Math.round(peso/(altura*altura));
        
        //double roundDbl = Math.round(d*100.0)/100.0;
        
        this.IMC=dato;
        return this.IMC;
    }
    
}
