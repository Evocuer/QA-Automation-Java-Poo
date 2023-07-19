/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import Entidad.Circunferencia;
import Servicio.ServicioCircunferencia;

/**
 *
 * @author Evocuer
 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioCircunferencia sc = new ServicioCircunferencia();
        Circunferencia c = sc.crearCircunferencia();

        sc.area(c);
        sc.perimetro(c);

    }

}
