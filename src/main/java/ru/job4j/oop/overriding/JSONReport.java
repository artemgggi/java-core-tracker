package ru.job4j.oop.overriding;

public class JSONReport extends TextReport {

	@Override
	public String generate(String name, String body) {
		return "name";
	}
}
