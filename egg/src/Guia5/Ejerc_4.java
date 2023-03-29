/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Random;

/**
 *
 * @author User
 */
public class Ejerc_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[][] matriz = new int[4][4];

        // Rellenar la matriz con valores aleatorios
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Obtener la matriz traspuesta
        int[][] traspuesta = obtenerTraspuesta(matriz);

        // Mostrar la matriz traspuesta
        System.out.println("Matriz traspuesta:");
        mostrarMatriz(traspuesta);
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int[][] obtenerTraspuesta(int[][] matriz) {
        int[][] traspuesta = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        return traspuesta;
    }
}