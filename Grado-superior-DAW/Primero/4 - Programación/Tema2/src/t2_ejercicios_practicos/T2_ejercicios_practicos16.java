/* EJERCICIO 16
Repetir el ejercicio 5 utilizando una estructura FOR. */

/* EJERCICIO 5
Realizar un programa que muestre la suma de todos los números del 1 al 10000.
Es decir: 1 + 2 + 3 + 4 + 5 + … + 9999 + 10000 */
package t2_ejercicios_practicos;

public class T2_ejercicios_practicos16 {

	public static void main(String[] args) {
		
		Integer suma = 0;
		
		for (int i = 0; i <= 10000; i++) {
			System.out.println(suma += i);
		}
		
	}

}