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
public class Ejerc_Ex_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa un número entre 1 y 10: ");
        int numero = input.nextInt();

        if (numero >= 1 && numero <= 10) {
            String[] romanos = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            System.out.println("El número " + numero + " en números romanos es: " + romanos[numero]);
        } else {
            System.out.println("El número ingresado es mayor a 10");
        }

        input.close();
    }

}
