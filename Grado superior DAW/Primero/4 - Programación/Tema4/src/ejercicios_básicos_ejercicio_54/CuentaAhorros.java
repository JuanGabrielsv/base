/*
EJERCICIO 54
(Utiliza LocalDate, List y BigDecimal donde corresponda)
Crea una clase CuentaAhorros. Esta cuenta bancaria tendrá un número de 20 dígitos que podrá
empezar por cero y una lista de movimientos bancarios.
Todos los movimientos tendrán registrada su fecha. Los movimientos podrán ser de 3 tipos:

• Cargo (llevan un importe y un CIF de la empresa que hace el cargo). Los cargos se imprimen así:
  [C - Fecha - Importe - CIF]. Por ejemplo: [C - 18/02/2022 - 33,21 € - 98765432F]
  
• Ingresos (llevan un importe y una descripción). Los ingresos se imprimen así:
  [I - Fecha - Importe - descripción]. Por ejemplo: [I - 18/02/2022 - 3,21 € - Ejemplo]
  
• Retiradas (llevan un importe). Las retiradas se imprimen así:
  [R - Fecha - Importe]. Por ejemplo: [R - 18/02/2022 - 12,00 €]
  
Una vez registrado un movimiento, este no se podrá borrar ni modificar.

Necesitamos estos métodos:

• Constructor de la clase CuentaAhorros que reciba el número de cuenta
• Método para añadir un movimiento a la cuenta
• Método para obtener el total de dinero en la cuenta
• Método para obtener una lista de cadenas que muestre todos los movimientos de la cuenta.
• Método igual que el anterior pero que sólo devuelva las retiradas
• Método igual que el anterior pero que sólo devuelva los ingresos
• Método igual que el anterior pero que sólo devuelva los cargos

Crea un programa que haga lo siguiente:

1. Crea una cuenta corriente e imprime el dinero que tenemos
2. Añade 2 cargos, 2 ingresos y 1 retirada
3. Imprime el dinero que tenemos
4. Imprime todos los movimientos
5. Imprime los cargos
6. Imprime los ingresos
7. Imprime las retiradas 
*/
package ejercicios_básicos_ejercicio_54;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class CuentaAhorros {

	private String numeroCuenta;
	private List<Movimiento> movimientos;

	// CONSTRUCTORES
	// Constructor de la clase CuentaAhorros que reciba el número de cuenta.

	public CuentaAhorros(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
		this.movimientos = new ArrayList<>();
	}

	// GETTERS AND SETTERS

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	// MÉTODOS
	// Método para añadir un movimiento a la cuenta.

	public void addMovimiento(Movimiento movimiento) {
		this.movimientos.add(movimiento);
	}

	// Método para obtener el total de dinero en la cuenta

	public BigDecimal getTotal() {
		BigDecimal sumaTotal = BigDecimal.ZERO;
		for (Movimiento movimiento : movimientos) {
			if (movimiento.getTipo().equals("I")) {
				sumaTotal = sumaTotal.add(movimiento.getImporte());
			} else {
				sumaTotal = sumaTotal.subtract(movimiento.getImporte());
			}
		}
		return sumaTotal.setScale(2, RoundingMode.HALF_UP);
	}

	/*
	 * Método para obtener una lista de cadenas que muestre todos los movimientos de
	 * la cuenta.
	 */

	public List<String> getMovimientosString() {
		List<String> resultado = new ArrayList<String>();
		for (Movimiento mov : movimientos) {
			resultado.add(mov.toString());
		}
		return resultado;
	}

	/* Método igual que el anterior pero que sólo devuelva las retiradas. */

	public List<String> getRetiradas() {
		List<String> resultado = new ArrayList<String>();
		for (Movimiento mov : movimientos) {
			if (mov.getTipo().equals(Movimiento.TIPO_RETIRADA)) {
				resultado.add(mov.toString());
			}
		}
		return resultado;
	}

	/* Método igual que el anterior pero que sólo devuelva los ingresos. */

	public List<String> getIngresos() {
		List<String> resultado = new ArrayList<String>();
		for (Movimiento mov : movimientos) {
			if (mov.getTipo().equals(Movimiento.TIPO_INGRESO)) {
				resultado.add(mov.toString());
			}
		}
		return resultado;
	}

	/* Método igual que el anterior pero que sólo devuelva los cargos */

	public List<String> getCargos() {
		List<String> resultado = new ArrayList<String>();
		for (Movimiento mov : movimientos) {
			if (mov.getTipo().equals(Movimiento.TIPO_CARGO)) {
				resultado.add(mov.toString());
			}
		}
		return resultado;
	}

}
