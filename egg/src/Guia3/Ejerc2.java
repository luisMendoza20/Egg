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
public class Ejerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner Leer=new Scanner(System.in);
        System.out.println("ingrese una frase a continuacon: ");
        String pala=Leer.nextLine();
        String correc="eureka";
        if (pala.equals(correc)){
        System.out.println("Correcto");
        }else{
        System.out.println("incorrecto");
        }
    }
}
