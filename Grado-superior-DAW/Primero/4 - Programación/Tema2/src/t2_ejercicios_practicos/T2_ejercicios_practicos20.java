/* EJERCICIO 20
Realizar un programa que imprima por consola un cuadrado de números así: (será necesario
utilizar un doble bucle)

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5 
*/
package t2_ejercicios_practicos;

public class T2_ejercicios_practicos20 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();		
		}

	}

}
