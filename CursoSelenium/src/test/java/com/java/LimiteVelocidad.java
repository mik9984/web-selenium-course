package com.java;

public class LimiteVelocidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//condicionales trabajando con if else
		int velocidad = 110;
		int limitevelocidad = 100;
		
//		if (velocidad > limitevelocidad) {
//			System.out.println("MULTA ");
//		}else {
//				System.out.println("Buen conductor velocidad permitida");
//			}
//		}

		// if anidado
		boolean highway = true;
		if (highway) {
			System.out.println("Estamos en carretera");
			
			limitevelocidad = 120;
			
			if (velocidad > limitevelocidad) {
			System.out.println("MULTA ");
		}else {
				System.out.println("Buen conductor velocidad permitida");
			}
		}else if(velocidad > limitevelocidad) {
			System.out.println("El coche va en una calle y va a exceso de velocidad MULTA");
		}else {
			System.out.println("El coche va en una carretera y va a velocidad permitida");
		}

		
		//Switch case

		int temperatura = 20;
		
		switch (temperatura) {
		case 5:
			System.out.println("esto es mucho frio ");
			break;
		
		case 10:
			System.out.println("frio");
			break;
			
		case 20:
		case 25:
			System.out.println("templado");
			break;
			
		case 35:
			System.out.println("calor");
			break;
			
			default:
				System.out.println("no encontro relacion con la temperatura");
				break;
			
		} 

		//if else if
//		boolean highway = false;
//
//		if (highway) {
//			System.out.println("Estamos conduciendo en una highway");
//			
//			limiteVelocidad = 120;
//
//			if (velocidad > limiteVelocidad) {
//				System.out.println("MULTA!!");
//			} else {
//				System.out.println("El coche va en la velocidad adecuada");
//			}
//
//		}else if(velocidad > limiteVelocidad) {
//			System.out.println("El coche esta en una calle y va a exceso de velocidad, MULTA!!");
//		}else {
//			System.out.println("El coche estan en una calle y va a una velocidad permitida");
//		}
	
	} 



}

	

	



