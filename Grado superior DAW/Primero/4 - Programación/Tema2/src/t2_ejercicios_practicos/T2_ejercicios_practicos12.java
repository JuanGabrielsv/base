/* EJERCICIO 12
Realizar un programa en el que solicitemos el username (login) de un usuario para registrarse.
Tendremos que validar este dato del siguiente modo:
- Quitaremos los espacios que tenga al inicio y al final
- Pondremos todo en mayúsculas
- Si la longitud es inferior a 10 caracteres, indicaremos un error y volveremos a solicitar
un nuevo username
- Si contiene algún espacio en blanco, indicaremos un error y volveremos a solicitar un
nuevo username
- Si todo está correcto, mostraremos el username final tras aplicar el algoritmo y
terminamos el programa. */
package t2_ejercicios_practicos;

import java.util.Scanner;

public class T2_ejercicios_practicos12 {
	
	public static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		
		String entradaUsuario = "";
		Boolean check = true;
		String sinEspacio = "";
		String sinEspaciomayus = "";
		Integer tamaño = 0;
		
		do {
			System.out.println("Username: ");
			entradaUsuario = SC.nextLine();
			
			sinEspacio = entradaUsuario.trim();
			sinEspaciomayus = sinEspacio.toUpperCase();
			tamaño = sinEspaciomayus.length();
			
			if (tamaño < 10) {
				System.out.println("ERROR - El 'username' no puede tener menos de 10 carácteres.");
			}
			else if (entradaUsuario.contains(" ")) {
				System.out.println("ERROR - El 'username' no puede tener espacio en blanco");
			}
			else {
				break;
			}
			
		} while (check);
		
		System.out.println("Tu 'username' es: " + sinEspaciomayus);
		
		SC.close();
	}

}
