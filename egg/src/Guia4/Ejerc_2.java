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
public class Ejerc_2 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
          while (true) {
            String NombrePersona = Nombre();
            int EdadPersona = Edad();
            if (EdadPersona<18){
                System.out.println("La persona es menor de edad.");
            }else{
                System.out.println("La persona es mayor de edad.");
            }
            System.out.println("¿Desea ingresar otro dato? Si/No");
            String respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("No")){
                break;
            } 
          }  
       }        

    
    public static String Nombre(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = leer.nextLine();
        return nombre;
    }
    
    public static int Edad(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la edad de la persona:");
        int edad = leer.nextInt();
           return 0;
                
    }
}
 