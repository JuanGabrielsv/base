/* EJERCICIO 1
Realizar un programa que solicite el radio de un círculo y nos indique a continuación cuál es la
circunferencia y el área de dicho círculo como resultado.
Utiliza las constantes de Java cuando consideres oportuno. */

package t1_ejercicios_repaso;
import java.util.Scanner;

public class T1_ejercicio_repaso1 {
	public static void main(String[] args) {
	
	/*DECLARACIÓN DE VARIABLE*/
	Double radio;
	Double circunferencia;
	Double area;
		
	/*OBTENER INFORMACIÓN POR TECLADO*/
	Scanner sc = new Scanner (System.in);
	System.out.println("Dame el radio de un círculo: ");
	radio = sc.nextDouble();
	
	/*CALCULOS*/
	circunferencia = (2 * 3.1416) * radio;
	area = 3.1416 * (radio * radio);
	
	/*IMPRESIÓN DE RESULTADO*/
	System.out.println("LA CIRCUNFERENCIA MIDE: " + circunferencia + "m");
	System.out.println("EL AREA ES DE: " + area + " metros cuadrados");	
	sc.close();
	}
}