/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
 */
package Guia3;


import java.util.Scanner;


public class Pratc5Clase5 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entre 1 y 20");
        int num_uno = entrada.nextInt();
        
        
        System.out.println("Ingrese otro numero entre 1 y 20");
        int num_dos = entrada.nextInt();
        
        System.out.println("Ingrese otro numero entre 1 y 20");
        int num_tres = entrada.nextInt();{
    }
        System.out.println("Ingrese otro numero entre 1 y 20");
        int num_cuatro = entrada.nextInt();{
        
    }
        
        System.out.print(num_uno + " ");
        for (int i=0;i<=num_uno; i++){
            System.out.print("*");
         } 
        System.out.println();
    }  
}