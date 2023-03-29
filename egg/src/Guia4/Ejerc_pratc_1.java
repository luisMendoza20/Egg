/*
Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Ejerc_pratc_1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese una secuencia de caracteres: ");
    String secuencia = sc.nextLine(); // Lee la secuencia de Caracteres
    String codificado = codificar(secuencia); // Llama al Subprograma/función
    System.out.println("Secuencia codificada: " + codificado); // Retorna el valor de la nueva frase
  }

  public static String codificar(String secuencia) {
    String codificado = "";
    for (int i = 0; i < secuencia.length(); i++) { // Realiza un ciclo para, hasta la cantidad de letras que tiene la frase.
      char c = secuencia.toLowerCase().charAt(i); // Recorre las letras, verificando si se encuentra dentro del Switch, si es así la codifica. toLowercase() Sirve para que lea minuscula siempre
      switch(c) {
        case 'a':
          codificado += "@";
          break;
        case 'e':
          codificado += "#";
          break;
        case 'i':
          codificado += "$";
          break;
        case 'o':
          codificado += "%";
          break;
        case 'u':
          codificado += "*";
          break;
        default:
          codificado += c;
          break;
      }
    }
    return codificado;
  }
}