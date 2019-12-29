package edu.neu.csye6200;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Sorting {

	private class Child implements Comparable<Child> {
		private Integer age = 0;
		private String name = null;
		
		public Child() {
			super();
		}
		public Child(Integer age, String name) {
			super();
			this.age = age;
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(name);
			sb.append(", Age: ").append(age);
			return sb.toString();
		}
		@Override
		public int compareTo(Child o) {
			return this.getAge().compareTo(o.getAge());
		}
	}
	
	public void intSortFilter() {
		List<Integer> ages = Arrays.asList(20,8,13,19,17,16,12,0,19,20,14,5,13,6,7,8,13,14,18,18);
		ages.forEach((n)-> System.out.print(n + " "));
		System.out.println(" : random set of ages.");
		ages.stream().sorted().forEach((n)-> System.out.print(n + " "));		
		System.out.println(" : sorted set of ages.");
		
		Predicate<Integer> age3AndUnder = (n)-> n < 3;
		Predicate<Integer> age8AndUnder = (n)-> n < 8;

		int target = 3;
		ages.stream().sorted().filter(age3AndUnder).forEach((n)-> System.out.print(n + " "));	
		System.out.println(" : set of ages at or below " + target);
		
		target = 8;
		ages.stream().sorted().filter(age8AndUnder).forEach((n)-> System.out.print(n + " "));		
		System.out.println(" : set of ages at or below " + target);

		System.out.println("\n done!");
	}
	
	public void ageSortFilter() {
		List<Child> people = Arrays.asList(
				new Child(53, "Jocelyn"), 	
				new Child(87, "Jill"), 
				new Child(35, "John"), 		
				new Child(39, "Jeff"), 
				new Child(18, "Joyce"), 	
				new Child(67, "Jerry"), 
				new Child(76, "Janice"), 	
				new Child(9, "Jake"), 
				new Child(44, "Jonna"), 	
				new Child(29, "Jessie"), 
				new Child(37, "Jack"), 		
				new Child(15, "Joe"), 
				new Child(77, "Jess"), 		
				new Child(63, "Janet"), 
				new Child(55, "Jane"), 		
				new Child(17, "Jenny")
				);

		people.forEach((n)-> System.out.print(n + " "));
		System.out.println(" : random set of ages.");
		people.stream().sorted().forEach((n)-> System.out.print(n + " "));		
		System.out.println(" : sorted set of ages.");

		Predicate<Child> age20AndUnder = (a)-> a.getAge().compareTo(20) <= 0;
		Predicate<Child> age50AndUnder = (a)-> a.getAge().compareTo(50) <= 0;

		int target = 20;
		people.stream().sorted().filter(age20AndUnder).forEach((n)-> System.out.print(n + " "));	
		System.out.println(" : set of ages at or below " + target);
		
		target = 50;
		people.stream().sorted().filter(age50AndUnder).forEach((n)-> System.out.print(n + " "));		
		System.out.println(" : set of ages at or below " + target);
				
		System.out.println("\n done!");
	}
	
	public static void demo() {
		Sorting obj = new Sorting();
		obj.intSortFilter();
		obj.ageSortFilter();
	}

}