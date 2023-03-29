package Guia3;

import java.util.Scanner;

/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.*/
public class Pratc3Clase4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese su nota: ");
		int nota = input.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Ingrese su nota: ");
			nota = input.nextInt();
		}
		System.out.println("Su nota esta dentro de los parametros correctos");
	}
}
