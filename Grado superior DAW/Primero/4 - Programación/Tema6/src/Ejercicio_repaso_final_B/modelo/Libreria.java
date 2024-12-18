package Ejercicio_repaso_final_B.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class Libreria {

	private String nombre;
	Map<String, Libro> mLibros;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<String, Libro> getmLibros() {
		return mLibros;
	}

	public void setmLibros(Map<String, Libro> mLibros) {
		this.mLibros = mLibros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libreria other = (Libreria) obj;
		return Objects.equals(nombre, other.nombre);
	}

	public BigDecimal getTasacionCompleta() {
		BigDecimal sumaPrecios = BigDecimal.ZERO;
		Set<Entry<String, Libro>> pares = mLibros.entrySet();
		for (Entry<String, Libro> entry : pares) {			
			if (entry.getValue().getTipo().equals(Libro.SEGUNDA_MANO)) {				
				sumaPrecios = sumaPrecios.add(entry.getValue().getPrecio().divide(new BigDecimal(2)));
			} else {
				sumaPrecios = sumaPrecios.add(entry.getValue().getPrecio());
			}
		}
		return sumaPrecios.setScale(2, RoundingMode.HALF_DOWN);
	}
	
	// getPrecioMedio() que devuelva el precio medio del libro 
	
	public BigDecimal getPrecioMedio() {
		BigDecimal total = getTasacionCompleta().divide(new BigDecimal(mLibros.size()));
		return total;
	}
	
	// getLibrosBaratos() que devuelva una lista (List) con todos los libros (sean del tipo que
	// sean) que cuesten menos de 10 euros.
	
	public List<Libro> getLibrosBaratos() {
		List<Libro> lLibro = new ArrayList<Libro>();		
		Set<Entry<String, Libro>> pares = mLibros.entrySet();
		for (Entry<String, Libro> entry : pares) {
			if (entry.getValue().getPrecio().compareTo(new BigDecimal(10)) == -1) {
				lLibro.add(entry.getValue());								
			}						
		}
		return lLibro;		
	}
	
	public List<BigDecimal> recorrerPrecio() {
		List<BigDecimal> lLibro = new ArrayList<BigDecimal>();
		
		Set<Entry<String, Libro>> pares = mLibros.entrySet();
		for (Entry<String, Libro> entry : pares) {
			lLibro.add(entry.getValue().getPrecio());			
		}
		return lLibro;
		
	}

	@Override
	public String toString() {
		return "Libreria [nombre=" + nombre + ", mLibros=" + mLibros + "]";
	}
	
	



}
