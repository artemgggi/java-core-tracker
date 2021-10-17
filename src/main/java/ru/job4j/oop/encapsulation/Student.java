package ru.job4j.oop.encapsulation;

public class Student {
	private String name;
	private String group;
	private String dateOfStart;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getDateOfStart() {
		return dateOfStart;
	}

	public void setDateOfStart(String dateOfStart) {
		this.dateOfStart = dateOfStart;
	}
}

class College {
	public static void main(String[] args) {
		Student student = new Student();
		student.setDateOfStart("10.01.2012");
		student.setGroup("150Б");
		student.setName("Alexey");
		System.out.println(student.getName());
		System.out.println(student.getGroup());
		System.out.println(student.getDateOfStart());

	}
}
