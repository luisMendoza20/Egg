/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
Declarar cuatro variables de tipo entero A, B, C y D 
* y asignarle un valor diferente a cada una. A continuación,
*realizar las instrucciones necesarias para que: B tome el valor 
* de C, C tome el valor de A, A tome el valor de D y D tome el valor
* de B. Mostrar los valores iniciales y los valores finales de cada variable.
* Utilizar sólo una variable auxiliar
 */
public class Ejerc_Ex_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
  int A, B, C, D, x;
        A = 1;
        B = 2;
        C = 3;
        D = 4;
        System.out.println("Los valores son; A=" + A + ", B=" + B + ", C=" + C + " y D=" + D);
        x = D;
        D = B;
        B = C;
        C = A;
        A = x;
        System.out.println("Los valores son; A=" + A + ", B=" + B + ", C=" + C + " y D=" + D);
    }
}
