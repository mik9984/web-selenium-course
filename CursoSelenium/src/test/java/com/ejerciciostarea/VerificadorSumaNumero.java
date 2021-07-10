package com.ejerciciostarea;

public class VerificadorSumaNumero {
	
//	Escribe un metodo que se llame hasEqualSum con 3 parametros de tipo int.
//	El metodo debe regresar un valor booleano verdadero si la suma de los dos primeros parametros es igual a la suma del tercer parametro, en otro caso devolver false.
//	Aqui algunos ejemplos de input y output:
//	* hasEqualSum(1, 1, 1);  deberia regresar FALSE porque la suma de 1+1 no es 1
//	* hasEqualSum(1, 1, 2);  deberia regresar TRUE porque la suma de 1+1 si es 2

	public static boolean hasEqualSum (int x, int y, int z) {
		int r;
		r = x + y;
		boolean resultado = true;
		
		if(r == z) {
			//boolean resultado = true;
			System.out.println("El resultado es " + resultado);
		}else {
			resultado = false;
			System.out.println("El resultado es " + resultado);
		}
		return resultado;
	
//		boolean resultado = (z == r);
//		
//		if (resultado == true) {
//			System.out.println("El resultado es " + resultado);
//		}else {
//			System.out.println("El resultado es " + resultado);
//		}
//		return resultado;
//		
		
		
//		
//		int suma = x + y;
//		
//		if (suma == z) {
//			System.out.println("El reultado es " + resultado);
//		}else{
//			System.out.println("El resultado es " + resultado);
//		}
//		return resultado;
				
	}
}
