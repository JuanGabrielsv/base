/*EJERCICIO 5
Realizar un programa que trabaje del siguiente modo:
1. Mostrar un mensaje preguntando “¿Cuánto te gustaría ganar al año?”
2. Esperar a que el usuario conteste indicando una cantidad
3. Mostrar un nuevo mensaje “Tu sueldo mensual sería de xx euros” (calcular xx
dividiendo lo indicado por el usuario entre 12) */

package t1_ejercicios;
import java.util.Scanner;

public class T1_ejercicio5 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("¿Cuánto te gustaría ganar al año?");
		Integer ganar = scanner.nextInt();
		Integer meses = 12;
		Integer total = ganar / meses;
		
		System.out.println("Tu sueldo mensual sería de " + total + " euros");
		
		scanner.close();
		
	}

}
