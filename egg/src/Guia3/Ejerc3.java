/*
 * /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
        usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
        pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
        Nota: investigar la función Lenght() en Java*/
package Guia3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner Leer=new Scanner(System.in);
        System.out.println("ingrese una frase a contnuacion: ");
        String pala = Leer.nextLine();
        if (pala.length()==8){
            System.out.println("CORRECTO");
        } else if(pala.length()!=8 ){
            System.out.println("INCORRECTO");
        }
 }
}
