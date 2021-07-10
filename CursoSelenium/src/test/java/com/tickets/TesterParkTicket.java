package com.tickets;

public class TesterParkTicket extends TicketsPark{

	
	double adultTicket;
	double childTicket;
	double studentTicket;
	boolean student = false;
	String priceDay;
	String park;
	int age;
	
	public TesterParkTicket(double price, boolean student, int age) {
		super();
		this.adultTicket = price;
		this.childTicket = price * (0.85);
		this.studentTicket = price * (0.6);
		this.student = student;
		this.priceDay = "Precio dia regular";
		this.park = "Testers Park";
		this.age = age;
	}
	//encapsulamiento
		private void setPriceDay(String priceday) {
			this.priceDay = priceDay;
		}
		
		private String getPriceDay() {
			return priceDay;
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

	}
