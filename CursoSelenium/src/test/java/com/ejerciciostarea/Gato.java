package com.ejerciciostarea;

public class Gato {
	
	public static boolean isCatPlaying (boolean verano, int temperatura) {
//		Los gatos pasan la mayor parte del día jugando. En particular, juegan si la temperatura está entre 25 y 35 (inclusive). A menos que sea verano, el límite superior es 45 (inclusive) en lugar de 35.
//		Escriba un método isCatPlaying que tenga 2 parámetros. El método debe devolver verdadero si el gato está jugando; de lo contrario, devolver falso
//		El primer parámetro debe ser de tipo booleano y debe llamarse "verano" que representa si es verano.
//		El segundo parámetro representa la temperatura y es de tipo int con el nombre "temperatura".
//		EJEMPLOS DE ENTRADA / SALIDA:
//		* isCatPlaying (verdadero, 10); debe devolver falso ya que la temperatura no está en el rango de 25 a 45
//		* isCatPlaying (falso, 36); debe devolver falso ya que la temperatura no está en el rango de 25 a 35 (el parámetro de verano es falso)
//		* isCatPlaying (falso, 35); debería volver a verdadero ya que la temperatura está en el rango de 25 a 35
		
		//verano = true;
		
		if (verano = true) {
			if (temperatura >=25 && temperatura <= 45) {
			System.out.println("VERDADERO ");
		}else {
				System.out.println("FALSO");
			}
		}else { 
			//if(verano = false)
			//{
			if (temperatura >=25 && temperatura <= 35) {
				System.out.println("Verdadero ");
			}else {
				System.out.println("Falso");
		}
		
		}
		
	
		return verano;
		
////		
//		if (verano = true) {
//			if (temperatura >=25 && temperatura <= 45) {
//				System.out.println("VERDADERO");
//			}else {
//				System.out.println("FALSO");
////
////				return verano;
////		}
//		
//		
//		
//		
//		}
//		
		
		
//		if (temperatura >=25 && temperatura <= 35 ) {
//			System.out.println("Verdadero");
//		}else if (temperatura <=25) {
//			System.out.println("Falso");
//		}
		
	
	
	
	
	
}
}
