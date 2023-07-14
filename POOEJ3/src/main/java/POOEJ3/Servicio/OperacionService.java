/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package POOEJ3.Servicio;

import POOEJ3.Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Evocuer
 */
public class OperacionService {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Operacion crearOperacion(){
    
        System.out.println("Introducir primer numero");
        double numero1 = leer.nextDouble();
        
        System.out.println("Introductir segundo numero");
        double numero2 = leer.nextDouble();
        
        return new Operacion (numero1, numero2);
        
    }
    
    public double sumar (Operacion o1){
    
        double suma = o1.getNumero1() + o1.getNumero2();
    
    return suma;
    }
}
