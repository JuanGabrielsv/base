/* 9.- Dado un número que se introduce por teclado, si es positivo verificar si se encuentra en el intervalo
abierto 60 – 90, de lo contrario emitir un mensaje de error. */
package t2_ejercicios_iniciales;
import java.util.Scanner;
public class T2_ejercicios_iniciales9 {
public static void main(String[]args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Dame un número entero: ");
	int numero = sc.nextInt();
		
		if (numero > 0 & numero > 60 & numero < 90) {
			System.out.println("afirmativo");			
		}
		else {
			System.out.println("mensaje de error");
		}
	
	sc.close();
}
}
