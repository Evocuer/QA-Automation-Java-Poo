/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;

import Entidad.Rectangulo;

/**
 *
 * @author Evocuer
 */
public class ServicioRectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {

        System.out.println("Ingresa la base del rectangulo");
        int base = leer.nextInt();
        System.out.println("Ingresa la altura del rectangulo");
        int altura = leer.nextInt();

        return new Rectangulo(base, altura);
    }

    public void superficie(Rectangulo r) {

        System.out.println("La superficie es: " + r.getBase() * r.getAltura());

    }

    public void perimetro(Rectangulo r) {

        System.out.println("El perimetro es: " + 2 * (r.getBase() + r.getAltura()));

    }

    public void dibujaRectangulo(Rectangulo r) {

        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                if (i == 0 || i == r.getAltura()-1) {
                    if (j == r.getBase()-1) {
                        System.out.println("*");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if (j == 0) {
                        System.out.print("*");
                    } else if (j == r.getBase()-1) {
                        System.out.println("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }

    }

}
