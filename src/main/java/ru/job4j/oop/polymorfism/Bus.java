package ru.job4j.oop.polymorfism;

public class Bus implements Transport {

	@Override
	public void go() {
		System.out.println("bus go");
	}

	@Override
	public void passengers(int passengers) {
		System.out.println(passengers);
	}

	@Override
	public int charge(int fuel) {
		return fuel;
	}
}
