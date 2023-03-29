/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejerc_Ex_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = leer.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = leer.nextInt();
        
        int resto = dividendo;
        int cociente = 0;
        while(resto >= divisor) {
            resto = resto - divisor;
            cociente++;
        }
        
        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + resto);
    }
}
