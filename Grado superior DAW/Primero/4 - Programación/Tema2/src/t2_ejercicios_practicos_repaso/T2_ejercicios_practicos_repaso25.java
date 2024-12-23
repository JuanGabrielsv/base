/*
EJERCICIO 25
Realizar un programa que juegue a Piedra/Papel/Tijera con el usuario. El programa funcionará
del siguiente modo:

1. Mostrará un mensaje indicando: “Piedra, papel, tijera… un, dos, tres… ya!!”
2. A continuación, se quedará esperando a que el usuario indique una de las tres
opciones. Estas opciones se indicarán con la palabra completa, pero podrán ser
escritas en mayúscula o minúsculas, nos da igual.
3. Luego, el programa generará aleatoriamente su mano (una de las tres), y se la
mostrará al usuario.
4. Por último, indicará quién ha ganado y terminará.

EJERCICIO 26
Mejorar el ejercicio anterior para que al terminar el juego pregunte al usuario si desea echar
otra partida. En caso afirmativo, repetir todo el proceso. En caso negativo, mostrar el
marcador final de victorias y terminar.*/ 



package t2_ejercicios_practicos_repaso;
import java.util.Scanner;
import java.util.Random;

public class T2_ejercicios_practicos_repaso25 {
	
	public static final Integer PIEDRA = 1;
	public static final Integer PAPEL = 2;
	public static final Integer TIJERAS = 3;
	
	public static void main(String[]args) {
		
//dar la bienvenida y coger datos del usuario.
		
		Scanner sc = new Scanner (System.in);
		Random random = new Random();
		
		
//Comprobar si lo escrito es válido.
		
		boolean jugadaValida = false;
		Integer jugadaUsuario = 0;
		
		do {
			
			System.out.println("Piedra, papel, tijera… un, dos, tres… ya!!");
			System.out.println("Escribe tu opción: ");
			String entradausuario = sc.nextLine();
			
			
			if (entradausuario .equals("Piedra") ) {				
				jugadaValida = true;
				jugadaUsuario = PIEDRA;				
			} 
			else if (entradausuario .equals("papel")) {
				jugadaValida = true;
				jugadaUsuario = PAPEL;
			}
			else if (entradausuario .equals("tijera")) {
				jugadaValida = true;
				jugadaUsuario = TIJERAS;
			}
			else { System.out.println("Escribe bien");
				
			}
			
		} while (jugadaValida == false);
		
		
//generar posibilidad random para la máquina. (3 posibles)
		Integer jugadaMaquina = random.nextInt(1,4);
			
//Comparar y comprobar quien ha ganado.(resultado de la partida 3 posibilidades)
		
		if (jugadaMaquina == PIEDRA) {
			System.out.println("La Máquina saca: Piedra");
			
			if (jugadaUsuario == PIEDRA) {
				System.out.println("Empate");
			}
			else if (jugadaUsuario == TIJERAS) {
				System.out.println("Has perdido");
				
			}else {
				System.out.println("Has Ganado");
			}
		}
		else if (jugadaMaquina == TIJERAS) {
			System.out.println("La Máquina saca: Tijeras");
			
			if (jugadaUsuario == PIEDRA) {
				System.out.println("Has Ganado");
			}
			else if (jugadaUsuario == TIJERAS) {
				System.out.println("Empate");
				
			}
			else {
				System.out.println("Has perdido");
			}
		}
		else {
			System.out.println("La Máquina saca: Piedra");
			
			if (jugadaUsuario == PIEDRA) {				
				System.out.println("Has perdido");
			}
			else if (jugadaUsuario == TIJERAS) {
				System.out.println("Has Ganado");
				
			}else {
				System.out.println("Empate");
			}
		}
		sc.close();

//guardar también contador de partida
//Dar el resultado y preguntar si volver a jugar.
		
		
	}

}
