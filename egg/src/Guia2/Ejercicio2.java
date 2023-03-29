/*
 * Escribir un programa que pida tu nombre, 
   lo guarde en una variable y 
   lo muestre por pantalla.
.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre;
       System.out.println("Ingrese tu nombres");
       nombre = entrada.next();
     System.out.println("tu nombres es:"+nombre );
    
    }
    
}
