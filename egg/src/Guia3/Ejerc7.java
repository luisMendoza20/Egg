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
public class Ejerc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner(System.in);
        String entrada;
        int correcto = 0;
        int incorrecto = 0;

        while (true) {
            System.out.print("Ingrese una cadena: ");
            entrada = input.nextLine();

            if (entrada.equals("&&&&&")) {
                break;
            }

            if (entrada.length() == 5 && entrada.charAt(0) == 'X' && entrada.charAt(4) == 'O') {
                correcto++;
            } else {
                incorrecto++;
            }
        }

        System.out.println("Ingresos correctos: " + correcto);
        System.out.println("Ingresos incorrectos: " + incorrecto);
    }
}

