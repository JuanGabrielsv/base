/* EJERCICIO 6
Realizar un programa que muestre por consola 5 veces tu nombre utilizando un bucle. Además
de tu nombre, deberá aparecer el número de línea que se ha impreso. Es decir, la salida
tendría que ser algo así:
Mi nombre es Abel. Línea 1
Mi nombre es Abel. Línea 2
Mi nombre es Abel. Línea 3
Mi nombre es Abel. Línea 4
Mi nombre es Abel. Línea 5 */

package t2_ejercicios_practicos;

public class T2_ejercicios_practicos6 {

	public static void main(String[] args) {
		
		Integer contador = 1;
		
		while (contador <= 5) {
			System.out.println("Mi nombre es Juan Gabriel. Linea " + contador);
			contador++;
		}
	}

}