package com.ejerciciostarea;

public class ImprimirVerificadorNumeros {

	public static void main(String[] args) {
		//llamado a comparacion
		Comparacion.comparacionNumeros(1, 1, 1);
		Comparacion.comparacionNumeros(1, 2, 3);
		Comparacion.comparacionNumeros(1, -1, 3);
		Comparacion.comparacionNumeros(1, 3, 1);

		Comparacion.comparacionNumeros(1, 3, -1);
		
		
		//llamado al verificador numero
		VerificadorSumaNumero.hasEqualSum(1, 1, 4);
		VerificadorSumaNumero.hasEqualSum(1, 1, 2);
		VerificadorSumaNumero.hasEqualSum(1, 3, 4);
		VerificadorSumaNumero.hasEqualSum(3, 3, 4);
	
	
		//boolean verano = true;
		//llamado gato
		Gato.isCatPlaying(false, 10);
		Gato.isCatPlaying(false, 36);
		Gato.isCatPlaying(false, 35);
	}

	
}
