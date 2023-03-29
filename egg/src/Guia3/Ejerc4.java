/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.*/
package Guia3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Ingrese una palabra a continuacion: ");
        String pala=input.nextLine();
        if (pala.substring(1, 2).equals("a") || pala.substring(1, 2).equals("A") ){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
                    
        }
    }
}