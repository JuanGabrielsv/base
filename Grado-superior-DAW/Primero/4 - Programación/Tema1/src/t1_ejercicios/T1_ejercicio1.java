/* EJERCICIO 1
Realizar un programa que haga lo siguiente:
1. Mostrar un mensaje pidiendo el nombre del usuario
2. Esperar a que el usuario escriba su nombre y registrarlo en una variable
3. Mostrar un nuevo mensaje pidiendo el apellido del usuario
4. Esperar a que el usuario escriba su apellido y registrarlo en otra variable
5. Mostrar un mensaje final indicando: "Su nombre completo es ... (nombre y apellido)" */
package t1_ejercicios;

import java.util.Scanner;

public class T1_ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Escribe tu nombre sin apellidos:");
		String nombre = scanner.nextLine();
		
		System.out.println("Escribe tu primer apellido:");
		String primerapellido = scanner.nextLine();
		
		System.out.println("Escribe tu segundo apellido:");
		String segundoapellido = scanner.nextLine();
		
		System.out.println("Tu nombre es: " + nombre + primerapellido + segundoapellido);
		
		scanner.close();
	}

}
