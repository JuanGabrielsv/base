/* EJERCICIO 4
Realizar un programa que solicite números por consola y los vaya sumando en una cuenta
acumulativa. Pedirá números hasta que el usuario introduzca el número 0. Cuando lo haga,
dejará de pedir números, mostrará el total de la suma, y terminará el programa. */
package t2_ejercicios_practicos; 

import java.util.Scanner;

public class T2_ejercicios_practicos4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer entradaUsuario;
		Boolean check = true;
		Integer suma = 0;
		
		do { 
			System.out.println("Introduce un numero entero, escribe '0' para salir: ");
			entradaUsuario = sc.nextInt();
			
			if (entradaUsuario == 0) {
				check = false;
			}
			else {
				suma += entradaUsuario;
				check = true;
			}
			
		} while (check == true);
		
		System.out.println(suma);
		sc.close();
	}

}