/*
 scriba un programa en el cual se ingrese
un valor limite positivo, y a continuacion
solicite numeros al usuario hasta que la suma 
de los numeros introducidos supere el limite inicial.

 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print( "Ingrese el valor limite ");
        int lim= input.nextInt();
        int suma=0;
        int n=0;
        do{
            System.out.print("ingrese numeros pares para sumar");
         n = input.nextInt();
         suma+=n;
                 System.out.print(suma);
        }while(suma<lim);
           
    
    }
}