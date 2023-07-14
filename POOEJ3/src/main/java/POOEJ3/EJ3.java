/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:

a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
*/

package POOEJ3;

/**
 *
 * @author Evocuer
 */

import java.util.Scanner;
import POOEJ3.Servicio.OperacionService;
import POOEJ3.Entidades.Operacion;

public class EJ3 {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        OperacionService os = new OperacionService();
        Operacion o1 = os.crearOperacion();
        
        System.out.println("La suma de los dos numeros es: " + os.sumar(o1));
        System.out.println("La resta de los dos numeros es: " + o1.restar());
        
        if (o1.multiplicar() == 0) {
            System.out.println("Error de multiplicacion por 0");
        } else {
            System.out.println("La multiplicacion de los dos numeros es: " + o1.multiplicar());
        }
        
        if (o1.division() == 0){
            System.out.println("Error de division por 0");
        } else {
            System.out.println("La Division de los dos numeros es: " + o1.division());
        }
        
    }
    
}
