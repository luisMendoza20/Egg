/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejerc_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño vector");
        int tamaño = leer.nextInt();
        int[] vector = new int[tamaño];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 11 + 1);
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + vector[i] + "]");
        }
        System.out.println("ingrese el numero q quiere buscar");
        int num = leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (num == vector[i]) {
                System.out.println("el numero repitido es : " +  num  + "  y sus posicion son : " + (i + 1));

            }
        }
    }
}

