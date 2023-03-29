package Guia3;
import java.util.Scanner;
/*Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.*/
public class Pratc1Clase4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el primer numero entero: ");
		int num1 = input.nextInt();
		System.out.println("Ingrese el segundo numero entero: ");
		int num2 = input.nextInt();
		
		if(num1 > 25 && num2 > 25) {
			System.out.println("Los dos numeros son mayores que 25");
			
		} else if (num1 > 25) {
			System.out.println("Su primer numero (" + num1 + ") es mayor que 25");
		}else if(num2 > 25) {
			System.out.println("Su segundo numero (" + num2 + ") es mayor que 25");
			
		}		else {
			System.out.println("Ninguno de sus numeros es mayor a 25");
		}
	}
}
