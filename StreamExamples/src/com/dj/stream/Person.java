package com.dj.stream;

import java.util.Arrays;
import java.util.List;

public class Person {
	private String name;
	private int age;
	private double weight;

	public Person(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}
	public Integer getNameLenght() {
		return name.length();
	}
	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "\nPerson [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	public static List<Person> getPersons() {
		return Arrays.asList
		(
		 new Person("David",35,70.2),
		 new Person("Marta",35,60.2),
		 new Person("Joan",33,74.2),
		 new Person("Pere",33,102.2),
		 new Person("Maria",34,55.2),
		 new Person("Ferran",37,70.2),
		 new Person("Ferran",39,75.2),
		 new Person("Laura",25,75.2),
		 new Person("Poloan",53,80.3)
		);
	}
}
