/* EJERCICIO 8
Repetir el ejercicio 7 anterior, pero con cadenas. Además, cuando comparemos si son iguales, no
tendremos en cuenta ni los espacios que pueda haber al inicio o al final de cada cadena, ni
tampoco las mayúsculas o minúsculas.  */

package t2_ejercicios_practicos;

import java.util.Scanner;

public class T2_ejercicios_practicos8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Boolean check = true;
		String entradaUsuario1;
		String entradaUsuario2;
		
		do {
			System.out.println("Introduce una palabra: ");
			entradaUsuario1 = sc.nextLine();
			entradaUsuario1 = entradaUsuario1.trim();
			
			System.out.println("Introduce otra palabra: ");
			entradaUsuario2 = sc.nextLine();
			entradaUsuario2 = entradaUsuario2.trim();
			
			if (!entradaUsuario1.equalsIgnoreCase(entradaUsuario2)) {
				check = true;
				System.out.println("Las palabras no son iguales, vuelva a intentarlo !!");
				System.out.println();
			}
			else {
				check = false;
				System.out.println("Palabras iguales, Hasta Luego !");
			}
			
		} while (check == true);
		sc.close();

	}

}
