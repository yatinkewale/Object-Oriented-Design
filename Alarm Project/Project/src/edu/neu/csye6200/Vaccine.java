package edu.neu.csye6200;

import java.time.LocalDate;
import java.time.Month;

public class Vaccine extends Alarm_Clock {
LocalDate a;
String name;
	public Vaccine(LocalDate date, String a) {
		super(date, a);
		this.a= date;
		this.name=a; 
	}
	@Override
	public void vaccination() {
		Month vaccmonth = a.getMonth();
		int vaccday = a.getDayOfMonth();
		LocalDate date_today = LocalDate.now();
		int vacc_curr_day= date_today.getDayOfMonth();
		Month vacc_curr_month= date_today.getMonth();
		int year = date_today.getYear();

		LocalDate halfyear = a.plusMonths(7);
		int vaccday2 = halfyear.getDayOfMonth();
		Month vaccmonth2 = halfyear.getMonth();
		int year2= halfyear.getYear();

		if (date_today.isEqual(halfyear) ) {
			System.out.println("Your Vaccination Date has Arrived, Get it done now !!!");
		}
		else if (date_today.isAfter(halfyear) ) {
			System.out.println("Sorry, your Vaccination Date was: "+halfyear+ ", it has passed");
		}
		else {
			System.out.println("Comeback Later for vaccination");
			System.out.println("Vaccine due on " + halfyear);
		}
		for(int i =0 ;i<=7 ;i++) {
			halfyear = a.plusMonths(7);
		}

	}
@Override
public void show() {
	System.out.println(this.toString());
	vaccination();
	System.out.println("\n");
	
}
}
