package com.java;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// operadores aritmeticos
		System.out.println("operadores aritmeticos");
		
		int x = 6;
		int y = 4;
		
		// cuando se quiere trabajar con decimales debes de usar double si solo son enteros int
		int z = x + y;
		
		System.out.println("El valor de la variable z igual a " + z);
		
		z = x - y;
		System.out.println("Ahora el valor de z es " + z);
		
		z = x * y;
		System.out.println("ahora el resultado de z es " + z );
		
		z = x / y;
		System.out.println("ahora el valor de z es " + z);
		
		//unarios for, while, do while  estructuras condicionales
		int A = 1;
		int B = 2;
		++A;
		
		System.out.println("el valor de A es " + A );
		
		--B;
		System.out.println("el valor de B es " + B );
		
		//relacionales if o condicionales
		//iguales ==  diferentes != mayor igual
		if(A != B) {
			System.out.println("Block code");
		}
		
		//operadores condicionales si alguno se cumple entra al bloque de codigo
		//  && todo se debe de cumplir para entrar
		//  || or con alguna que cumpla entra 
		int part1 = 5;
		int part2 = 4;
		int part3 = 8;
		int part4 = 8;
		
		if (part1 == part2 || part3 == part4) {
			System.out.println("Block code operadores condicionales");
		}
		
	}

}
