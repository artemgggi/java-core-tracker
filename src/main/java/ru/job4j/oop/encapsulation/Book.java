package ru.job4j.oop.encapsulation;

import java.util.Objects;

public class Book {
	private String name;
	private int amountlists;

	public Book(String name, int amountlists) {
		this.name = name;
		this.amountlists = amountlists;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmountlists() {
		return amountlists;
	}

	public void setAmountlists(int amountlists) {
		this.amountlists = amountlists;
	}
}

class Library {
	public static void main(String[] args) {
		Book mumu = new Book("MuMu", 100);
		Book tihiydon = new Book("TihiyDon", 300);
		Book voynaimir = new Book("VoynaImir", 200);
		Book visneviysad = new Book("VisneviySad", 500);
		Book[] books = new Book[4];
		books[0] = mumu;
		books[1] = tihiydon;
		books[2] = voynaimir;
		books[3] = visneviysad;
		for (Book bk : books) {
			System.out.println(bk.getName() + " - " + bk.getAmountlists());
		}
		System.out.println();
		Book temp = books[0];
		books[0] = books[3];
		books[3] = temp;
		for (Book bk : books) {
			System.out.println(bk.getName() + " - " + bk.getAmountlists());
		}
		System.out.println();
		for (Book bk : books) {
			if (Objects.equals(bk.getName(), "VisneviySad")) {
				System.out.println(bk.getName() + " - " + bk.getAmountlists());
			}
		}
	}
}
