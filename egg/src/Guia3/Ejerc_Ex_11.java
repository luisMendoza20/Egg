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
public class Ejerc_Ex_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        int numero = leer.nextInt();
        int contador = 0;
        while(numero != 0) {
            numero = numero / 10;
            contador++;
        }
        System.out.println("El número tiene " + contador + " dígitos.");
    }
}
