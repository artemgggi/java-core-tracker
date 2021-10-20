package ru.job4j.oop.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input your question:");
		String question = input.nextLine();
		int answer = new Random().nextInt(3);
		switch (answer) {
			case 0 -> System.out.println("Yes");
			case 1 -> System.out.println("No");
			default -> System.out.println("Maybe");
		}
	}
}
