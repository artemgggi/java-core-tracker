package ru.job4j.oop.polymorfism;

public interface Transport {
	void go();

	void passengers(int passengers);

	int charge(int fuel);
}
