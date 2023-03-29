/*
 * Los profesores del curso de programación de Egg necesitan llevar un registro 
de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de 
aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 
2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
*Primer trabajo práctico evaluativo 10%
*Segundo trabajo práctico evaluativo 15%
*Primer Integrador 25%
*Segundo integrador 50%

 */
package Guia5;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author User
 */
public class Ejerc_Ex_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] vectorNota1 = new int[10];
        int[] vectorNota2 = new int[10];
        int[] vectorNota3 = new int[10];
        int[] vectorNota4 = new int[10];
        String[] vectorNombre = new String[10];
        double[] suma = new double[10];
        int aprobado = 0;
        int desaprobado = 0;
        for (int i = 0; i < vectorNota1.length; i++) {
            System.out.print("Introduzca el nombre del alumno: ");
            vectorNombre[i] = sc.nextLine();
            vectorNota1[i] = rand.nextInt(10);
            vectorNota2[i] = rand.nextInt(10);
            vectorNota3[i] = rand.nextInt(10);
            vectorNota4[i] = rand.nextInt(10);
            
            suma[i] =  (vectorNota1[i]*0.10) + (vectorNota2[i]*0.15) + (vectorNota3[i]*0.25) + vectorNota4[i]*0.50;
            if (suma[i] >= 7) {
                System.out.println(vectorNombre[i] + " aprobó la cursada, la nota es: " + suma[i] );
                aprobado++;
            } else {
                System.out.println(vectorNombre[i] + " desaprobó la cursada, la nota es: " + suma[i]);
                desaprobado++;
            }
        }
        System.out.println("Los aprobados son: " + aprobado + ", los desaprobados son: " + desaprobado);
    }
}