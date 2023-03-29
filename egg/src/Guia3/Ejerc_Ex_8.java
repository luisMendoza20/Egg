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
public class Ejerc_Ex_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        int num, cont = 0, pares = 0, impares = 0;

        while (true) {
            System.out.print("Ingrese un número entero: ");
            num = leer.nextInt();

            if (num < 0) {
                continue; // Ignoramos los números negativos y volvemos al inicio del bucle
            }

            cont++;

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (num % 5 == 0) {
                System.out.println("Ha ingresado un múltiplo de 5.");
                break; // Salimos del bucle al encontrar un múltiplo de 5
            }
        }

        System.out.println("Cantidad de números leídos: " + cont);
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}
