/* EJERCICIO 21
Realizar un programa que imprima por consola un triángulo de números así: (será necesario
utilizar un doble bucle)
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9 */

package t2_ejercicios_practicos;

public class T2_ejercicios_practicos21 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	

}