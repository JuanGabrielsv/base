/* 10.- Introducir varias edades por teclado hasta que la edad sea 0 ( que indicará el final del ingreso de las
edades) y calcular la media de los valores introducidos. */
package t2_ejercicios_iniciales;
import java.util.Scanner;

public class T2_ejercicios_iniciales10 {
public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int edad = 0;
	int sumaEdades = 0;
	int numeroEdades = 0;
	
		do {
			System.out.println("Introduce una edad (0 para finalizar); ");
			edad = sc.nextInt();
			
			if (edad != 0) {
				sumaEdades += edad;
				numeroEdades++;
			}
		} while (edad != 0);
		
		double mediaEdades = (double) sumaEdades / numeroEdades;
		
		System.out.println("La media de las edades es " + mediaEdades);
	
	sc.close();
}
}
