/* 13.- Dado un número positivo, escribir la tabla de multiplicar de dicho número: 
A) con un bucle while
B) con un bucle do while
C) con un bucle for */

package t2_ejercicios_iniciales;
import java.util.Scanner;

public class T2_ejercicios_iniciales13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer entradaUsuario;
		Integer contador = 1;
		
		
		/*System.out.println("Introduce un número positivo y entero: ");
		entradaUsuario = sc.nextInt();
		
		while (contador <= 10) {
			System.out.println(entradaUsuario + " x " + contador + " = " + (entradaUsuario * contador));
			contador++;
		}
		sc.close();*/
		
		 System.out.println("Introduce un número posivo y entero: ");
		entradaUsuario = sc.nextInt();
			
		do { 
			System.out.println(entradaUsuario + " x " + contador + " = " + (entradaUsuario * contador));
			contador++;			
		}
		while (contador <= 10);
		sc.close();
		
		
/*		System.out.println("Introduce un número positivo y entero: ");
		entradaUsuario = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(entradaUsuario + " x " + i + " = " + (entradaUsuario * i));				
		}
		
		sc.close();		
*/		
	}

}