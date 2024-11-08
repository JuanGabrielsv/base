/*
EJERCICIO 33
Construye una nueva clase Semaforo que debe funcionar del siguiente modo:

1) Tendrá dos atributos:
a. color, de tipo String. Podrá ser Rojo, Ámbar o Verde. Lo correcto es que
declares estos valores como constantes.
b. parpadeando, de tipo Boolean.

2) Sólo tendrá el constructor por defecto, que tendrá que inicializar el color en Rojo sin
parpadear.

3) Crea los métodos get y set

4) En los métodos set, debes validar lo siguiente:
a. Cuando se intente cambiar el color, si se indica un color no válido, entonces no
se modificará el atributo.
b. Cuando se intente cambiar el estado de parpadeo, si se intenta activar el
parpadeo cuando el color es distinto a Ámbar, entonces no se modificará.

5) Sobrescribe el método toString() para que devuelva lo siguiente en función del valor de
los atributos:
a. Semáforo en ROJO
b. Semáforo en VERDE
c. Semáforo en ÁMBAR
d. Semáforo en ÁMBAR parpadeando

6) Añade un método cambiarEstado() que modifique el valor de los atributos del
semáforo siguiendo este ciclo de estados:
VERDE -> ÁMBAR (parpadeando) -> ÁMBAR (sin parpadear) -> ROJO -> VERDE y así 
*/
package ejercicios_básicos_ejercicio_33;

public class Semaforo {
	
	public static final String ROJO = "ROJO";
	public static final String VERDE = "VERDE";
	public static final String AMBAR = "ÁMBAR";
	
	private String color;
	private Boolean parpadeando;
	
	public Semaforo() {
		color = ROJO;
		parpadeando = false;
	
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if (color.equals(ROJO) || color.equals(AMBAR) || color.equals(VERDE)) {
			this.color = color;
		}		
	}

	public Boolean getParpadeando() {
		return parpadeando;
	}
	
	public void setParpadeando(Boolean parpadeando) {
		if (parpadeando && !color.equals(AMBAR)) {
			return;
		}
		this.parpadeando = parpadeando;
	}

	@Override
	public String toString() {
		
		String dev = "Semáforo en " + color;
		
		if(color.equals(AMBAR) && parpadeando) {
			return dev + " parpadeando";
		}
		return dev;
	}
	
	public void cambiarEstado() {
		if (color.equals(VERDE)) {
			color = AMBAR;
			parpadeando = true;
		}
		else if (color.equals(AMBAR) && parpadeando) {
			parpadeando = false;
		}
		else if (color.equals(AMBAR)) {
			color = ROJO;
		}
		else {
			color = VERDE;
		}
	}
	

}
