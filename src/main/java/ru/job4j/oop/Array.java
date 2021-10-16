package ru.job4j.oop;

public class Array {
	private int[] array;

	public Array(int[] array) {
		this.array = array;
	}

	public void print() {
		for (int index = 0; index < array.length; index++) {
			System.out.println(array[index]);
		}
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		Array reduce = new Array(array);
		reduce.print();
	}
}
