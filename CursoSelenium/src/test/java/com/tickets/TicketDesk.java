package com.tickets;

public class TicketDesk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double price = 100;
		boolean isStudent = true;
		int age = 20;
		
		TicketstPark ticket = new CoolParkTicket(price, isStudent, age);
		ticket.printPriceDay();
		double coolprice = ticket.getTicketPrice;
		
		//Si es nino y estudiante que me de otro
		//Utilizar el metodo prinPriceDay con la key como parametro
		//Agregar un constructor a la clase testersParkTicket que tenga un descuento especial
		//Generar un metodo static en TicketDesk que sume el total de los tickets e imprima el precio final
		
	}

}
