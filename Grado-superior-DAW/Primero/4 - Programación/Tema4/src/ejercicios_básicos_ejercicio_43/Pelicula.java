/*
EJERCICIO 43
Nota: utiliza lo que has aprendido de herencia y de clases abstractas.

Necesitamos programar una aplicación para gestionar una base de datos de películas. De cada
película recogeremos los siguientes datos (tendremos que tener métodos get() y set() para
ellos):

	• Año de estreno
	• Título
	• Lista de actores
	• Su guionista
	• Su director
	
Tanto actores como guionistas y directores se identifican por su nombre, año de nacimiento y
nacionalidad. Cada una de estas clases tendrá que tener:

	• Métodos get() y set() de todos esos atributos.
	• Método getSueldo(), que es constante para cada tipo:
		o Los actores cobran 100.000 euros
		o Los guionistas cobran 50.000 euros
		o Los directores cobran 200.000 euros.
		
Crea las clases necesarias para gestionar esta aplicación. Cuando termines, realiza un
programa que haga lo siguiente:

1. Crea 4 actores:
	a. Blas Blau de España nacido en 1983
	b. Laura Pozo de Italia nacida en 1981
	c. Marcel Cade de Suiza nacido en 2001
	d. Violeta Volo de Rusia nacida en 1999
	
2. Crea 1 directora:
	a. Sara Marea de Portugal nacida en 1994
	
3. Crea 2 guionistas:
	a. Marco Smith de Reino Unido nacido en 1988
	b. Cheng Shu de China nacido en 1977
	
4. Crea una película que se estrena en 2027 dirigida por Sara y con Marco como guionista. Actuarán Blas y Laura. Su título es “Do you know Joe Blas?”
5. Crea otra película con el mismo año de estreno y directora. El guionista es el chino, y participan todos los actores. Su título es “Muerte en la sombra”
6. Imprime la lista de actores de la primera película
7. Imprime el sueldo del guionista de la primera película y su nacionalidad
8. Borra al actor suizo de la segunda película y añádelo a la primera
9. Imprime los actores de las dos películas 
*/
package ejercicios_básicos_ejercicio_43;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	private Integer anoEstreno = 0;
	private String titulo = "";
	private List<Actor> listaActores;
	private Guionista guionista;
	private Director director;

	public Pelicula() {
		this.listaActores = new ArrayList<>();
	}

	// MÉTODOS GET Y SET

	public Integer getAnoEstreno() {
		return anoEstreno;
	}

	public void setAnoEstreno(Integer anoEstreno) {
		this.anoEstreno = anoEstreno;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Guionista getGuionista() {
		return guionista;
	}

	public void setGuionista(Guionista guionista) {
		this.guionista = guionista;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public List<Actor> getListaActores() {
		return listaActores;
	}

	public void setListaActores(List<Actor> listaActores) {
		this.listaActores = listaActores;
	}

	@Override
	public String toString() {
		return "Pelicula [anoEstreno=" + anoEstreno + ", titulo=" + titulo + ", listaActores=" + listaActores
				+ ", guionista=" + guionista + ", director=" + director + "]";
	}

}
