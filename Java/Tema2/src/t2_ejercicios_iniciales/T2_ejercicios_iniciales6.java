/* 6.- Dado un número entero que se introduce por teclado, determinar si es positivo, negativo o nulo. */
package t2_ejercicios_iniciales;
import java.util.Scanner;

public class T2_ejercicios_iniciales6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Dame un número entero, que no sea decimal: ");
		Integer numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("positivo");
		}
		else if (numero < 0) {
			System.out.println("negativo");
		}
		else {
			System.out.println("nulo");
		}
		
		sc.close();
		
	}

}