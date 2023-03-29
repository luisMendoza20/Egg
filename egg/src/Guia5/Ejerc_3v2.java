/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejerc_3v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
           System.out.println("Ingrese tamaño vector");
        int tamaño = leer.nextInt();
        int[] vector = new int[tamaño];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = leer.nextInt(); // Llenar el vector con números
        }

        // Inicializar las variables contadoras
        int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0;

        // Recorrer el vector y contar los dígitos de cada número
        for (int i = 0; i < vector.length; i++) {
            int numDigitos = String.valueOf(vector[i]).length();
            switch (numDigitos) {
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
            }
        }

        // Imprimir los resultados
        System.out.println("Números de 1 dígito: " + uno);
        System.out.println("Números de 2 dígitos: " + dos);
        System.out.println("Números de 3 dígitos: " + tres);
        System.out.println("Números de 4 dígitos: " + cuatro);
        System.out.println("Números de 5 dígitos: " + cinco);
    }
}
        
        