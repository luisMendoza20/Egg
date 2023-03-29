/*
 Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que 
represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejerc_Ex_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
System.out.print("Ingresa la clase del socio (A, B o C): ");
        String clase = input.nextLine().toUpperCase();

        System.out.print("Ingresa el costo del tratamiento: ");
        double costo = input.nextDouble();

        double descuento = 0.0;

        switch (clase) {
            case "A":
                descuento = 0.5;
                break;
            case "B":
                descuento = 0.35;
                break;
            case "C":
                descuento = 0.0;
                break;
            default:
                System.out.println("Clase de socio inexistente.");
                return;
        }

        double importeAPagar = costo * (1 - descuento);

        System.out.println("El importe a pagar para el socio de clase " + clase + " es de $" + importeAPagar);

        
    }

}
