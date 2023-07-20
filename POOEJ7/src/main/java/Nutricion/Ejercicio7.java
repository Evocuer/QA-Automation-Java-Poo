/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nutricion;

import Entidades.Persona;
import Servicios.ServicioNutricion;

/**
 *
 * @author Evocuer
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] indmc = new int[4];
        boolean[] mayor = new boolean[4];
        
        ServicioNutricion sn = new ServicioNutricion();
        Persona[] p = new Persona[4];
        
        crearPersona(p, sn);
        calcImc(sn, p, indmc);
        mayor = calcMayor(sn, p, mayor);
        porcentaje(p, indmc, mayor);
    }
    
    public static void porcentaje(Persona[] p, int[] indmc, boolean[] mayor) {
    
        double low = 0;
        double mid = 0;
        double high = 0;
        double mlow = 0;
        
        
        for (int i = 0; i < 4; i++) {
            switch (indmc[i]) {
                case -1 -> low++;
                case 0 -> mid++;
                case 1 -> high++;
            }
            if (mayor[i]) {
                mlow++;
            }
        }
        System.out.println("El porcentaje de personas por debajo del peso es: " + (low/4)*100  );
        System.out.println("El porcentaje de personas en el peso es: " + (mid/4)*100  );
        System.out.println("El porcentaje de por encima del peso es: " + (high/4)*100  );
        System.out.println("El porcentaje de personas mayores de edad es: " + (mlow/4)*100);
        System.out.println("El porcentaje de personas " + (1-(mlow/4))*100);
    }
    
    public static void crearPersona(Persona[] p, ServicioNutricion sn) {
        for (int i = 0; i < 4; i++) {
            p[i] = sn.crearPersona();
        }
    }
    
    public static void calcImc(ServicioNutricion sn, Persona[] p, int[] indmc) {
        for (int i = 0; i < 4; i++) {
            indmc[i] = sn.calcularIMC(p[i]);

            switch (indmc[i]) {
                case -1 -> System.out.println("El paciente esta por debajo de su peso ideal");
                case 0 -> System.out.println("El paciente esta en el peso ideal");
                case 1 -> System.out.println("El paciente esta por encima del peso ideal");
            }
        }
    }
    
    public static boolean[] calcMayor(ServicioNutricion sn, Persona[] p, boolean[] mayor) {
        for (int i = 0; i < 4; i++) {
            mayor[i] = sn.esMayorDeEdad(p[i]);
            
            if (mayor[i]) {
                System.out.println("El paciente " + p[i].getNombre() + " es mayor de edad");
            } else {
                System.out.println("El paciente " + p[i].getNombre() + " es menor de edad");
            }

        }
        return mayor;    
    }
}
