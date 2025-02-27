/*
EJERCICIO 24
Crea métodos toString() para las clases que has creado. Úsalos en tus programas para imprimir
al final el objeto que has creado (tanto el profesor como el alumno)
*/
package ejercicios_básicos_ejercicio_24;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Profesor profesor1 = new Profesor();
		Alumno alumno1 = new Alumno();
		Curso curso = new Curso();		
		
		System.out.println("Introduce el nombre del profesor: ");
		profesor1.setNombre(sc.nextLine());
		System.out.println("Introduce la edad del Profesor: ");
		profesor1.setEdad(sc.nextInt());
		sc.nextLine();	
		
		System.out.println("Introduce el nombre del Alumno: ");
		alumno1.setNombre(sc.nextLine());
		//sc.next();
		System.out.println("Introduce la edad del Alumno: ");
		alumno1.setEdad(sc.nextInt());
		sc.nextLine();
		System.out.println("Introduce el DNI del Alumno: ");
		alumno1.setDni(sc.nextLine());
		System.out.println("Introduce la nota del Alumno: ");
		alumno1.setNota(sc.nextDouble());
		System.out.println("Introduce el identificacdor del curso del Alumno: ");
		curso.setIdentificador(sc.nextInt());
		sc.nextLine();
		System.out.println("Introduce la descripción del curso del Alumno: ");
		curso.setDescripcion(sc.nextLine());
		sc.close();
		
		alumno1.setCurso(curso);
		
		System.out.println(alumno1);
		System.out.println(profesor1);
		
	}
}
