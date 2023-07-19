/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import java.util.Scanner;

import Entidad.Libro;

/**
 *
 * @author Evocuer
 */
public class ServicioLibro {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro() {
        
        System.out.println("Ingrese la informacion del libro a agregar");
        System.out.println("Ingrese el ISBN");
        double isbn = leer.nextDouble();
        System.out.println("Ingrese el titulo");
        String titulo = leer.next();
        System.out.println("Ingrese el autor");
        String autor = leer.next();
        System.out.println("Ingrese el Numero de Paginas");
        int paginas = leer.nextInt();
        
        return new Libro(isbn, titulo, autor, paginas);
    }
    
    public void mostrarLibro(Libro l) {
        
        System.out.println("Datos del libro");
        System.out.println(l.toString());
        
    }
    
    
}
