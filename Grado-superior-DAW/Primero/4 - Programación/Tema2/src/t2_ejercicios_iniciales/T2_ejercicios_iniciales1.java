/* 1.- Escribe un programa en el que se declaren las variables enteras x e y. Asígnales los valores 144 y 999
respectivamente. A continuación, muestra por pantalla el valor de cada variable, la suma, la resta, la
división y la multiplicación. */ 

package t2_ejercicios_iniciales;

public class T2_ejercicios_iniciales1 {
	public static void main(String[]args) {
		
		Integer x = 144;
		Integer y = 999;
		
		System.out.println("x vale: " + x);
		System.out.println("y vale: " + y);
		System.out.println("su suma es: " + (x+y));
		System.out.println("su resta es: " + (x-y));
		
		Double x1 = x.doubleValue();
		Double y2 = y.doubleValue();
		
		System.out.println("su división es: " + (x1/y2));
		System.out.println("su multiplicación es: " + (x*y));
	}
}