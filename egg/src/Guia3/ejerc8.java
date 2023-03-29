/*
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*        *
*        *
* * * *

 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ejerc8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int num = input.nextInt();
        
        // Imprimir las filas
        for (int i = 1; i <= num; i++) {
            // Imprimir las columnas
            for (int j = 1; j <= num; j++) {
                // Imprimir el asterisco en las esquinas o en los bordes
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("* ");
                } else { 
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
    }
}
