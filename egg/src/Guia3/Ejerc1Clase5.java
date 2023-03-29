/*
 *Crear un programa que dado un número determine si es par o impar.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejerc1Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num =0;
        
        System.out.println("Ingrese un numero");
        num = entrada.nextInt();
        
        if (num % 2 == 0){
            System.out.println("El numero ingresado es PAR");
        }else{
            System.out.println("El numero ingresado es IMPAR");
        }
       
    }
    
}
