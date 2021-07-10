package com.tickets;

public class CoolParkTicket extends TicketsPark{

	
	double adultTicket;
	double childTicket;
	double studentTicket;
	boolean student = false;
	String PriceDay;
	String park;
	int age;
	
	public CoolParkTicket(double price, boolean student, int age) {
		super();
		this.adultTicket = price;
		this.childTicket = price * (0.80);
		this.studentTicket = price * (0.5);
		this.student = student;
		this.PriceDay = "Precio dia regular";
		this.park = "Cool Park";
		this.age = age;
	}
	
	//encapsulamiento
	private void setPriceDay(String PriceDay) {
		this.PriceDay = PriceDay;
	}
	
	private String getPriceDay() {
		return PriceDay;
	}
	
	
	@Override //significa que se esta tratando de utilizar un metodo padre
	public double getTicketPrice() {
		double priceTicket;
		
		if (age>=18 && !student) {
			priceTicket = adultTicket;
			System.out.println("Precio adulto $ " + adultTicket);
		}else if (age>=18 && student) {
			priceTicket = studentTicket;
			System.out.println("Precio estudiante $ " + studentTicket);
		}else {
			priceTicket = childTicket;
			System.out.println("Precio niño $ " + childTicket);
		}
		return priceTicket;
	}

	@Override
	public void printPriceDay() {
		System.out.println(welcomeMessageString() + park + getPriceDay());
	}

	@Override
	public void printPriceDay(String authKey, String priceday) {
		setPriceDay(priceday);
		System.out.println(welcomeMessageString() + park + getPriceDay());
	}
}
