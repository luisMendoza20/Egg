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
public class Ejerc_Ex_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double resultado, num1, num2, mult;
        num1=(Math.random()*10);
        num2=(Math.random()*10);
        mult=num1*num2;
        int intentos;
        intentos=0;
        
        do { 
            System.out.println("Adivine el resultado de la multiplicacion");
            resultado = leer.nextInt();
            if (resultado==mult){
            System.out.println("Usted ha adivinado!");
            }else{
            System.out.println("Perdió. Intente nuevamente: ");
            }
            intentos=intentos+1;
        } while (intentos<3);
        
        System.out.println("El resultado de la multiplicación es: " + resultado);
  
    } 
}
