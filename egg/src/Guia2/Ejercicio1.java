/*
 * Escribir un programa que pida dos números
   enteros por teclado y calcule la suma de los dos.
   El programa deberá después mostrar 
   el resultado de la suma */
package Guia2;

import java.util.Scanner;

public class Ejercicio1 {

    /** static Scanner leer = new Scanner(System.in);
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //muesta en la pantala
       System.out.println("Ingrese los 2 numero que quire sumar");
      int num1 = input .nextInt();
      int num2 = input .nextInt();
       int suma = num1 + num2;
       System.out.println("a suma de los numeros es:" +suma);
}
    
}
