package com.tickets;

public abstract class TicketsPark {

	//Instancia de variable
	String welcomeMessage;
	
	//constructor
	public TicketsPark () {
		this.welcomeMessage = "Bienvenidos a CoolTesters Park";
		
	}
	
	//metodo obtener mensaje
	public String welcomeMessageString() {
		return this.welcomeMessage;
		
	}
	
	public abstract double getTicketPrice();
	public abstract void printPriceDay();
	public abstract void printPriceDay(String authkey, StringPriceDay);
}
