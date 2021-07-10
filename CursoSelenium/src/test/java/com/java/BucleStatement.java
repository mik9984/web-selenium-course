package com.java;

public class BucleStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//While mientras se cumpla condicion se ejecuta
		int numero = 1;
		while (numero <=10) {
			
			//Blockcode
			System.out.println("el numero es " + numero);
			++numero;
			
		}
		
		//Do While yo hago algo mientras se cumpla una condicion
		//lo hago primero y despues valido
		//cuantas veces se tiene que sumar un mismo numero para llegar a 100 o superar el valor de 100
		
		int numeroLimite = 20;
		int sumaTotal = 0;
		int count = 0;
		
		do {
			//sumaTotal = sumaTotal + numeroLimite;
			sumaTotal += numeroLimite;
			//++count;
			count = count +1;
		} while (sumaTotal < 100);
		
			System.out.println("el numero se sumo " + count + " veces");
			
			//for
			int numeroFor = 10;
			for (int i = 1; i<= numeroFor; i++) {
				System.out.println("el numero for es " + i);
	}

	
	}
		
}
