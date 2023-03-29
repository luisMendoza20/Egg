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
public class Ejerc_Ex_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números de la serie: ");
        int cant = sc.nextInt();
        int[] fibo = new int[cant];
        for (int i = 0; i < cant; i++) {
            fibo[i] = fibonacci(i+1);
        }
        escribirVector(fibo);
    }
    public static int fibonacci(int n) {
        int fnAnt = 0, fn = 1, fnSig;
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                fnSig = fnAnt + fn;
                fnAnt = fn;
                fn = fnSig;

            }
        }

        return fn;
    }
    
    public static void escribirVector(int[] fibo) {
        for (int elemento : fibo) {
            System.out.println(" " + elemento);
        }
    }
    
}
