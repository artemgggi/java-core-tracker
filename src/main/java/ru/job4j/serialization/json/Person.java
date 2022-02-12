package ru.job4j.serialization.json;

import java.util.Arrays;

public class Person {
	private  boolean sex;
	private  int age;
	private  Contact contact;
	private  String[] statuses;


	public Person(boolean sex, int age, Contact contact, String[] statuses) {
		this.sex = sex;
		this.age = age;
		this.contact = contact;
		this.statuses = statuses;
	}

	public Person(boolean sex, int age, Contact contact, String worker, String married) {
	}

	public boolean getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person{"
				+ "sex=" + sex
				+ ", age=" + age
				+ ", contact=" + contact
				+ ", statuses=" + Arrays.toString(statuses)
				+ '}';
	}
}
