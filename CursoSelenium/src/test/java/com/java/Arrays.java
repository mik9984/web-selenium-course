package com.java;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ejemplo de arreglo unidimensional
		String[] nombres = {"Ricardo", "Jesica", "Aide", "Felipe"};
		
		System.out.println("El nombre es " + nombres[2]);
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("el nombre de la persona es " + nombres[i]);
		}
		
		//arreglo bidimensional "X" y "Y"

		String [][] nombreEdad = new String[4][4];
		
		nombreEdad[0][0] = "Ricardo";
		nombreEdad[0][1] = "30";
		
		nombreEdad[1][0] = "Jesica";
		nombreEdad[1][1] = "31";
	
		nombreEdad[2][0] = "Aide";
		nombreEdad[2][1] = "32";
	
		nombreEdad[3][0] = "Felipe";
		nombreEdad[3][1] = "33";
		
		System.out.println("El nombre es " + nombreEdad[2][0] + " y su edad es " + nombreEdad[2][1]);
		System.out.println("El nombre es " + nombreEdad[3][0] + " y su edad es " + nombreEdad[3][1]);
	
		//llamado de metodos
		printNombreEdad(nombreEdad[1][0], nombreEdad[1][1]);
		
		int z = suma(2,2);
		System.out.println("la suma es " + z );
		
		System.out.println("suma " + suma(4,4));
	}

	public static void printNombreEdad(String nombre, String edad) {
		System.out.println("METODO: El nombre de la persona es " + nombre + " la edad es " + edad);
	}
	
	public static int suma (int x, int y) {
		return x+y;
	}
}
