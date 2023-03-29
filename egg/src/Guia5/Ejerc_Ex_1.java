/*
 * Realizar un algoritmo que calcule la suma de todos
los elementos de un vector de tamaño N, con los valores 
ingresados por el usuario.

 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejerc_Ex_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[5];
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese un numero: ");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("El total de los elementos dentro del vector es: " + suma);

    }
}
