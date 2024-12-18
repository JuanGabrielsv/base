//un id, titulo, director, fecha de lanzamiento, duración (en minutos), y una lista de actores.
package com.example.demo.modelo;

import java.time.LocalDate;
import java.util.List;

public class Pelicula {
	private String id;
	private String titulo;
	private String director;
	private LocalDate fechaLanzamiento;
	private Integer duracion;
	private List<Actor> listaActores;

	public Pelicula(String id, String titulo, String director, LocalDate fechaLanzamiento, Integer duracion,
			List<Actor> listaActores) {
		this.id = id;
		this.titulo = titulo;
		this.director = director;
		this.fechaLanzamiento = fechaLanzamiento;
		this.duracion = duracion;
		this.listaActores = listaActores;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public List<Actor> getListaActores() {
		return listaActores;
	}

	public void setListaActores(List<Actor> listaActores) {
		this.listaActores = listaActores;
	}

}
