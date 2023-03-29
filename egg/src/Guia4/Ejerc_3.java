/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejerc_3 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de euros a convertir: ");
        double euros = sc.nextDouble(); // Se introduce la cantidad de euros
        System.out.println("Introduce la divisa a la que quieres convertir (Libras/Dolares/Yenes): ");
        String divisa = sc.next(); // Se introduce la palabra que se va a aplicar en el Switch
        convertirDivisa(euros, divisa);
    }
    
    public static void convertirDivisa(double euros, String divisa) {
        double resultado = 0;
        String mensajeDivisa = ""; // Se declar un string de mensaje que contiene la palabra que se introdujo en la linea 31
        switch (divisa.toLowerCase()) {
            case "libras":
                resultado = euros * 0.86;
                mensajeDivisa = "libras";
                break;
            case "dolares":
                resultado = euros * 1.28611;
                mensajeDivisa = "dólares";
                break;
            case "yenes":
                resultado = euros * 129.852;
                mensajeDivisa = "yenes";
                break;
            default:
                System.out.println("Divisa no soportada.");
                return;
        }
        System.out.println(euros + " euros son equivalentes a " + resultado + " " + mensajeDivisa + ".");
    }
}