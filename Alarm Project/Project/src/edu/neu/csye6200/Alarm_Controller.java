package edu.neu.csye6200;

import java.time.LocalDate;
import java.time.Month;

public class Alarm_Controller {
	LocalDate date1 = LocalDate.of(2018, Month.MARCH, 31);
	LocalDate date2 = LocalDate.of(2017, Month.JULY, 02);
	LocalDate date3 = LocalDate.of(2017, Month.JANUARY, 13);
	LocalDate date4 = LocalDate.of(2017, Month.AUGUST, 26);
	LocalDate date5 = LocalDate.of(2017, Month.AUGUST, 31);
public void vaccine_data() {
	Vaccine obj = new Vaccine(date1, "Ab Cd");
	Vaccine obj2 = new Vaccine(date2, "Ef Gh");
	Vaccine obj3 = new Vaccine(date3, "Ij Kl");
	Vaccine obj4 = new Vaccine(date4, "Mn Op");
	Vaccine obj5 = new Vaccine(date5, "Qr St");
	
	obj.show();
	obj2.show();
	obj3.show();
	obj4.show();
	obj5.show();
}
public void registration_data() {
	Registration obj = new Registration(date1, "Ab Cd");
	Registration obj2 = new Registration(date2, "Ef Gh");
	Registration obj3 = new Registration(date3, "Ij Kl");
	Registration obj4 = new Registration(date4, "Mn Op");
	Registration obj5 = new Registration(date5, "Qr St");
	
	obj.show();
	obj2.show();
	obj3.show();
	obj4.show();
	obj5.show();
}
	public void demo() {
		System.out.println("################ Welcome to NEU Daycare ################ \n");
		System.out.println("*****************Vaccination Alarm******************* \n");
		vaccine_data();
		System.out.println("\n");
		System.out.println("*****************Registration Alarm******************* \n");
	registration_data();
	System.out.println("\n");
	
}
}
