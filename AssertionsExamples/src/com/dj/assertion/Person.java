package com.dj.assertion;

public class Person {

	private String name;
	private int age;
	private double creadit;

	public Person(String name, int age, double creadit) {
		super();
		this.setName(name);
		this.setAge(age);
		this.setCreadit(creadit);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		assert name != null : "Name is can not be null";
		if (name.isEmpty()) {
			throw new IllegalArgumentException("Name is not valid");
		}
		assert (name != null);
		this.name = name;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getCreadit() {
		return creadit;
	}

	public void setCreadit(double creadit) {
		this.creadit = creadit;
	}
}
