package com.ejercicio;

public class Multiplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double z = multiplicacionNumeros(3.7, 8.8);
		//System.out.println("El resultado es :" + imprimirMultiplicacion);
		imprimirMultiplicacion(z);
	}
		public static double multiplicacionNumeros (double x, double y) {
			return (x*y);
		}

		public static void imprimirMultiplicacion (double z) {
			System.out.println(("El resultado de la multiplicacion es " + z));
		}


		
	//	public static operador (int x, int y) {
		//	return x+y;
		//}

}


