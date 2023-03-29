package Guia3;

import java.util.Scanner;

/*Escriba un programa que lea 20 números. Si el número leído es igual a 0 se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.*/
public class Pratc4Clase4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int i = 0;
		int suma = 0;
		
		do {
			if(i == 19){
				break;
			} //if
			System.out.println("Ingrese un numero: ");
			num = input.nextInt();
			
			if(num >= 0) {
				suma = num + suma;
			}
			
			if(num == 0) {
				System.out.println("Se capturó el numero cero");
				break;
			} //if
			i++;
		}while(true); //do
		System.out.println("La suma total es: " + suma);
	} //main

} //proyecto
