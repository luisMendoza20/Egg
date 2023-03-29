
import java.util.Scanner;

/*
 * Dada una cantidad de grados centígrados
   se debe mostrar su equivalente en grados 
   Fahrenheit. La fórmula correspondiente es:
   F = 32 + (9 * C / 5).

package Guia2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cantidad de grados centígrados se debe mostrar");
        float temp=entrada.nextInt();
        float F= 32 +(9 *temp/5);
        System.out.println("usted ingreso aproximadamente= " +F+ " Fahrenheit ");
    }
    
}
