/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEJ3.Entidades;

/**
 *
 * @author Evocuer
 */
public class Operacion {
    
    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public void setNumero1(double numero){
        this.numero1 = numero;
    }
    
    public void setNumero2(double numero){
        this.numero2 = numero;
    }
    
    public double getNumero1(){
        return numero1;
    }
    
    public double getNumero2(){
        return numero2;
    }
    
    public double sumar(){
    
        double suma = numero1 + numero2;
        
    return suma;
    }
    
    public double restar(){
        
        double resta = numero1 - numero2;
    
    return resta;
    }
    
    public double multiplicar(){
    
        double mult = 0;
        
        if (numero1 == 0 || numero2 == 0) {
            mult = 0;          
        } else {
            mult = numero1*numero2;
        }
        
    return mult; 
    }
    
    public double division(){
    
    double div = 0;
    
       if (numero1 == 0 || numero2 == 0) {
           div = 0.0;
       } else {
           div = numero1/numero2;
       }    
       
    return div;
    }
}
