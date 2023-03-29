/*
 * Escribir un programa que pida una frase
   y la muestre toda en mayúsculas y después
   toda en minúsculas.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra ;
        System.out.print("Ingrese una frase ");
        palabra = entrada.next();
        System.out.println(palabra.toUpperCase());
        System.out.println(palabra.toLowerCase());
    }
    
}
