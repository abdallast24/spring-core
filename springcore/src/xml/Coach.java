package xml;

import xml.sport.Sport;

public class Coach {
	private String name;
	private int age;
	private Sport sport;

	public Coach() {
	}

	public Coach(Sport sport) {
		this.sport = sport;
	}

	public String start() {
		return String.format("Iam %s\nI have %d\nIam the coach of %s", name, age, sport.start());
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void testInitMethod() {
		System.out.println("Iam in init method");
	}
	
	public void testDestroyMethod() {
		System.out.println("Iam in destroy method");
	}
}
