/*
 Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
Después haremos otra función o procedimiento que imprima el vector.

 */
package Guia5;

import java.util.Random;

/**
 *
 * @author User
 */
public class Ejerc_Ex_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int vector[] = new int[10];
        llenarVector(vector);
        imprimirVector(vector);
    }

    public static void llenarVector(int[] vector) {
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            int numero = (int) (Math.random() * 10 + 1);
            vector[i] = rand.nextInt(100);
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}