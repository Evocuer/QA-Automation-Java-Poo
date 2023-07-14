/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;

import Entidades.Persona;
import Entidades.TipoSexo;


/**
 *
 * @author Evocuer
 */
public class ServicioNutricion {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        
        System.out.println("Ingrese el nombre del paciente");
        String nombre = leer.next();
        int sex = 0;
        do {
            System.out.println("Ingrese el sexo del paciente");
            System.out.println("1. Hombre\n2. Mujer\n3. Otro"); 
            sex = leer.nextInt();
        } while (sex > 3 && sex <= 0 );              
        System.out.println("Ingrese la edad del paciente");
        int edad = leer.nextInt();
        System.out.println("Ingrese el peso del paciente (kg)");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la estatura del paciente (m)");
        double estatura = leer.nextDouble();
        
        TipoSexo sexo = switch (sex) {
            case 1 -> TipoSexo.HOMBRE;
            case 2 -> TipoSexo.MUJER;
            case 3 -> TipoSexo.OTRO;
            default -> null;
        };
        return new Persona(nombre, edad, peso, estatura, sexo);
    }
    
    public int calcularIMC(Persona p1) {
        
        int indexmc;
        double imc = p1.getPeso()/(p1.getEstatura()*p1.getEstatura());
        
        if (imc < 20) {
            indexmc = -1;
        } else if (imc >=20 && imc <= 25) {
            indexmc = 0;
        } else {
            indexmc = 1;
        }
        
        return indexmc;
    }
    
    public boolean esMayorDeEdad(Persona p1) {
                
        return p1.getEdad() >= 18;
    }
}
