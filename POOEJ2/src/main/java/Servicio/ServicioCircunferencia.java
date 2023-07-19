/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;
import static java.lang.Math.PI;

import Entidad.Circunferencia;

/**
 *
 * @author Evocuer
 */
public class ServicioCircunferencia {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Circunferencia crearCircunferencia() {

        System.out.println("Ingrese el radio de la circunferencia");

        return new Circunferencia(leer.nextDouble());
    }

    public void area(Circunferencia c) {

        System.out.println("El area es: " + PI * (Math.pow(c.getRadio(), 2)));

    }

    public void perimetro(Circunferencia c) {

        System.out.println("El perimetro es: " + 2 * PI * c.getRadio());

    }

}
