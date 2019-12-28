package edu.neu.csye6200;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Registration extends Alarm_Clock{
LocalDate a ;
String name;
List<LocalDate> list = new ArrayList<>();

	public Registration(LocalDate date, String a) {
		super(date, a);
	 this.a = date;
	 this.name = a;
	
	}

@Override
public void register() {
	LocalDate current = LocalDate.now();
	Month month = current.getMonth();
	int day = current.getDayOfMonth();
	
	LocalDate d = LocalDate.now();
	int year = d.getYear();
	int currentday = d.getDayOfMonth();
	Month currentmonth = d.getMonth();

	LocalDate nextyear = a.plusYears(1);
	int year2= nextyear.getYear();
	int day2 = nextyear.getDayOfMonth();
	Month month2 = nextyear.getMonth();
	list.add(a);
	 
	 
	if (currentday == day2 && currentmonth == month2 ) {
		
		System.out.println("Your Registration date has arrived, Get it done now !!!!");
	}
	else if (current.isAfter(nextyear)) {
		System.out.println("Sorry, your Registration Date was: "+nextyear+ ", it has passed" );
	}
	else if(current.isBefore(nextyear)) {
		System.out.println("Comeback Later for Registration");
		System.out.println("Registration due on " + nextyear);
	}
	for(int i =0; i<=7; i++) {
		nextyear = a.plusYears(1);
	}
	
}
@Override
public void show() {
	System.out.println(this.toString());
	register();
	System.out.println("\n");
}
}
