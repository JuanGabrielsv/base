/* EJERCICIO 7
Realizar un programa que solicite dos números al usuario. Si los números son iguales, terminar
el programa con un saludo. Si no son iguales, volver a pedirlos hasta que lo sean. */

package t2_ejercicios_practicos;

import java.util.Scanner;

public class T2_ejercicios_practicos7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Boolean check = true;
		Integer entradaUsuario1;
		Integer entradaUsuario2;
		
		do {
			System.out.println("Introduce un número entero: ");
			entradaUsuario1 = sc.nextInt();
			
			System.out.println("Introduce otro número entero: ");
			entradaUsuario2 = sc.nextInt();
			
			if (entradaUsuario1 != entradaUsuario2) {
				check = true;
				System.out.println("Números no iguales, vuelva a intentarlo !!");
				System.out.println();
			}
			else {
				check = false;
				System.out.println("Números iguales, Hasta Luego !");
			}
			
		} while (check == true);
		sc.close();
	}

}