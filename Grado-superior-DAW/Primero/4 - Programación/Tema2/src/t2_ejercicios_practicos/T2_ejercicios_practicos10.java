/* EJERCICIO 10
Realizar un programa que solicite dos cadenas al usuario por separado. Si alguna de las dos es
vacía o sólo tiene espacios en blanco, volver a pedirla indefinidamente. Cuando tengamos las
dos cadenas, escribirlas por consola en orden alfabético. */

package t2_ejercicios_practicos;

import java.util.Scanner;

public class T2_ejercicios_practicos10 {
	
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String entradaUsuario1 = "";
		String entradaUsuario2 = "";
		Boolean check = true;
		Integer comparacion = 0;
		
		do {
			System.out.println("Introduce una palabra: ");
			entradaUsuario1 = sc.nextLine();
						
			if (entradaUsuario1.isEmpty() || entradaUsuario1.isBlank()) {
				System.out.println(ANSI_RED + "La palabra no puede estar vacia ni contener sólo espacios! " + ANSI_RESET);
			}
			else {				
				break;
			}
			
		} while (check);
		
		do {
			System.out.println("Introduce otra palabra: ");
			entradaUsuario2 = sc.nextLine();
			
			if (entradaUsuario2.isEmpty() || entradaUsuario2.isBlank()) {
				System.out.println("La palabra no puede estar vacia ni contener sólo espacios! ");
			}
			else {
				break;
			}
			
		} while (check);
		
		comparacion = entradaUsuario1.compareTo(entradaUsuario2);
		
		if (comparacion <= 0) {
			System.out.println(entradaUsuario1 + " " + entradaUsuario2);
		}
		else {
			System.out.println(entradaUsuario2 + " " + entradaUsuario1);
		}
		
		sc.close();

	}

}
