/* EJERCICIO 18
Realiza un programa que solicite un número del 1 al 12 y muestre por consola a qué mes del
año corresponde. Realizar el programa utilizando una estructura SWITCH. */
package t2_ejercicios_practicos;

import java.util.Scanner;

public class T2_ejercicios_practicos18 {
	
	public static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		
		Integer entradaUsuario = 0;
		
		System.out.println("Introduce un número del 1 al 12 y te dire a que mes corresponde: ");
		entradaUsuario = SC.nextInt();
		
		switch (entradaUsuario) {
		case 1:
			System.out.println("ENERO !");
			break;
		case 2:
			System.out.println("FEBRERO !");
			break;
		case 3:
			System.out.println("MARZO !");
			break;
		case 4:
			System.out.println("ABRIL !");
			break;
		case 5:
			System.out.println("MAYO !");
			break;
		case 6:
			System.out.println("JUNIO !");
			break;
		case 7:
			System.out.println("JULIO !");
			break;
		case 8:
			System.out.println("AGOSTO !");
			break;
		case 9:
			System.out.println("SEPTIEMBRE !");
			break;
		case 10:
			System.out.println("OCTUBRE !");
			break;
		case 11:
			System.out.println("NOVIEMBRE !");
			break;
		case 12:
			System.out.println("DICIEMBRE !");
			break;
		default:
			break;
		}
		
		SC.close();
		
	}

}