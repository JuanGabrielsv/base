/* 12.- Dado un número positivo introducido por teclado, escribir por pantalla tantos asteriscos como número
haya escrito. */
package t2_ejercicios_iniciales;
import java.util.Scanner;

public class T2_ejercicios_iniciales12 {
	public static void main(String[] args) {
		
		/* DECLARAMOS VARIABLES */
		Scanner sc = new Scanner(System.in);
		Integer num;
		
		/* GUARDAMOS LA INFORMACIÓN */
		System.out.println("Introduce un número positivo y que no sea decimal: ");
		num = sc.nextInt();
		
		/* BUCLE QUE SE REPITE LO QUE VALGA EL NÚMERO */
		for (Integer j = 1; j <= num; j++) {
			System.out.print("*");
		}
		sc.close();
	}
}