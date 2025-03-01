/* EJERCICIO 2
Realiza un programa que solicite dos números enteros y los multiplique. Mostrará el resultado
de esa multiplicación.
Prueba a introducir números muy grandes. ¿Qué ocurre? ¿Cómo podemos resolverlo? */

package t1_ejercicios_repaso;
import java.util.Scanner;
public class T1_ejercicio_repaso2 {
	public static void main(String[] args) {
		
		/* DACLARAMOS VARIABLES */
		Integer numero1;
		Integer numero2;
		Integer multiplicacion;
		
		/* OBTENEMOS INFORMACIÓN POR TECLADO */
		Scanner scanner = new Scanner (System.in);
		System.out.println("Dame un número sin decimales: ");
		numero1 = scanner.nextInt();
		System.out.println("Dame otro número sin decimales: ");
		numero2 = scanner.nextInt();
		
		/* CALCULOS */
		multiplicacion = numero1 * numero2;
		
		/* IMPRESIÓN DE RESULTADO */
		System.out.println("El resultado de la multiplicacion de " + numero1 + " por " + numero2 + " es: " + multiplicacion);
		scanner.close();
	}
}

