/* EJERCICIO 18
Crea una clase llamada Alumno que tenga como atributos privados el dni, nombre, edad y
nota. Además, tendrá métodos get y set para todos los atributos. Luego crea un programa que
lea por consola los datos de un alumno y los registre en un objeto de la clase que acabas de
crear. */

package t4_ejercicios_basicos_I;

public class Ejercicio18Alumno {

	

	private String dni;
	private String nombre;
	private Integer edad;
	private Double nota;
	
	public Ejercicio18Alumno() {
		this.dni = "";
		this.nombre ="";
		this.edad = 0;
		this.nota = 0.0;
	}
	
	public Ejercicio18Alumno(String dni, String nombre, Integer edad, Double nota) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.nota = nota;
	}

	public String getDni() {
		return dni;
	}
	
	public void setDni(String dniNuevo) {
		this.dni = dniNuevo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombreNuevo) {
		this.nombre = nombreNuevo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edadNuevo) {
		this.edad = edadNuevo;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double notaNuevo) {
		this.nota = notaNuevo;
	}

}