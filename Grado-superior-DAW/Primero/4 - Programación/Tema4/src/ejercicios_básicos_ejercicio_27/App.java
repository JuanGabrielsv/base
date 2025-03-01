/*
EJERCICIO 27
Crea un método validarDNI() en la clase Alumno que devuelva un Boolean indicando si el dni
que tiene establecido el alumno es correcto o no. Para ello, tendrás que validar lo siguiente:
a) El dni no puede ser null ni vacío
b) El dni tiene que tener una longitud total de 9.
Modifica el programa del ejercicio 25 para validar el DNI de los alumnos que vas creando. Si
alguno no es correcto, vuelve a solicitarlo. 
*/
package ejercicios_básicos_ejercicio_27;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		Curso curso = new Curso(1,"DAM-DAW");
		Alumno[] alumnos = new Alumno[3];
		Integer posicion = 65424546;		
		
		for (int i = 0; i < alumnos.length; i++) {
			
			Alumno alumno = null;
			Boolean dniCorrecto = false;		
			
			do {
				System.out.println("Dime el DNI del Alumno1: ");
				String dni = sc.nextLine();
				alumno = new Alumno(dni);
				if (!alumno.validarDNI()) {
					System.err.println("Dni no válido");					
				}
				else {
					dniCorrecto = true;
				}				
			} while (!dniCorrecto);
			
			System.out.println("Dime el nombre del Alumno1: ");
			alumno.setNombre(sc.nextLine());					
			System.out.println("Dime la nota del Alumno1: ");
			alumno.setNota(sc.nextDouble());		
			System.out.println("Dime la edad del Alumno1: ");
			alumno.setEdad(sc.nextInt());
			sc.nextLine();
			
			alumno.setCurso(curso);
			alumnos[i] = alumno;
		}
		sc.close();
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		
		for (int i = 0; i < alumnos.length; i++) {
			for (int j = 0; j < alumnos.length; j++) {
				if (alumnos[i].equals(alumnos[j]) && alumnos[i] != alumnos[j] && posicion != i) {
					System.err.println("ERROR - Los alumnos de las posiciones " + i + " y " + j + " tienen el mismo DNI");
					posicion = j;
				}				
			}			
		}
		
	}
}
