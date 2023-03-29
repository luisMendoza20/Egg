/*
 * Realizar un programa que pida dos
números enteros positivos por teclado 
y muestre por pantalla el siguiente 
menú:El usuario deberá elegir una opción
y el programa deberá mostrar el resultado
por pantalla y luego volver al menú. El programa 
deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5,
en vez de salir del programa directamente, se debe 
mostrar el siguiente mensaje
de confirmación: ¿Está seguro que desea salir
del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa,
caso contrario se vuelve a mostrar el
menúlate in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejerc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
       
      System.out.println(" Menu");
      System.out.println("1 Sumar");
      System.out.println("2 Restar");
      System.out.println("3 Multiplicar");
      System.out.println("4 Dividir");
      System.out.println("5 Salir");
       int Menu= input.nextInt();
      switch(Menu) {
		case 1:
			System.out.println("Ingrese los numero para Sumar");
                        int Num= input.nextInt();
                        int suma= input.nextInt();
                        if(Num >= 0) {
				suma = Num + suma;
                                System.out.println("la suma de los numero es:"+suma);
			}
			break;
		case 2:
			System.out.println("Ingrese los numero para Restar ");
                        float Num2= input.nextFloat();
                        float Rest= input.nextFloat();
                        float resul;
			 /*rsul = Num2 + Resta;
                         System.out.println("la Resta de "+Num2 "y " +  Rest "es:" + resul);
                         break;*/
		case 3:
			System.out.println("Ingrese los numero para Multiplicar");
			break;
		case 4:
			System.out.println("Ingrese los numero Dividir");
			break;
                case 5:
                       System.out.println();      
		default: System.out.println("No existe un valor valido para tipo de bomba");
		}
	}
}