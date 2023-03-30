/*
Realizar un algoritmo que llene un vector con los 100 primeros 
números enteros y los muestre por pantalla en
orden descendente
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejerc_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int[] vector = new int[100];// dimension vector 
        //vector[0] = 100; // imprime valores al vector
        // asigno valoresvector.length; 
        for (int i = 0; i < vector.length; i++) {
            vector[i] = 100-i;
        }
        
        //se muestra el vector 
        for (int i = 0 ; i < vector.length; i++) {
            System.out.println("[" + vector[i] + "]");
        }

    }

}
