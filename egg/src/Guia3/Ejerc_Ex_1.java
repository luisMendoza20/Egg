/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/*Dado un tiempo en minutos,
calcular su equivalente en días y horas.
Por ejemplo, si el usuario ingresa 1600 minutos,
el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class Ejerc_Ex_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.print("Ingresa el tiempo en minutos: ");
               int minutos = input.nextInt();
               int dias = minutos/1440;
               int horas = (minutos % 1440)/60;
               int min2 = minutos % 60;
               System.out.println(minutos+ "Minutos equivalen a "+dias+" dias "+horas+" Horas "+min2+" Minutos");
    }
}
