package edu.neu.csye6200;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Alarm_Clock extends Abstract_Alarm_API {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;
	LocalDate a;
	public Alarm_Clock(LocalDate date, String a) {
		super();
		this.a = date;
		this.name = a;
	}

	public LocalDate getA() {
		return a;
	}

	public void setA(LocalDate a) {
		this.a = a;
	}

	@Override
	public void vaccination() {
	}
	@Override 
	public void register() {
	}
	public String toString() {
		StringBuilder info = new StringBuilder("Student Having ");
		info.append(" Name: ").append(this.getName()+ ",");
		info.append(" DOB: ").append(this.getA());

		return info.toString();
	}
	
	@Override
	public void show() {
		System.out.println(this.toString());
		
	}

}
