/*
Realizar un programa que llene una matriz de tamaño NxM
con valores aleatorios y muestre la suma de sus elementos.

 */
package Guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejerc_Ex_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Ingrese el tamaño del vector");
        int tamVec = sc.nextInt();
        int[] vector = new int[tamVec];
        for (int i = 0; i < tamVec; i++) {
            for (int j = 0; j < tamVec; j++) {
                vector[i] = rand.nextInt(9);
                System.out.print("[ " + vector[i] + " ]");
            }
            System.out.println("");
        }
    }
}