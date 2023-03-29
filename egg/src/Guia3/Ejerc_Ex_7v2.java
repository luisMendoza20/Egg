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
public class Ejerc_Ex_7v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int n = leer.nextInt();
        
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        
        int cont = 0;
        do {
            System.out.print("Ingrese un número: ");
            double num = leer.nextDouble();
            
            sum += num;
            max = Math.max(max, num);
            min = Math.min(min, num);
            
            cont++;
        } while (cont < n);
        
        double prom = sum / n;
        
        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio es: " + prom);
    }
}
