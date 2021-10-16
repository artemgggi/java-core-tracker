package ru.job4j.oop;

public class Battery {
	private int load;

	public Battery(int load) {
		this.load = load;
	}

	public void exchange(Battery another,int value) {
		another.load = another.load + value;
		this.load = this. load - value;
	}

	public static void main(String[] args) {
		Battery battery = new Battery(100);
		Battery battery2 = new Battery(50);
		System.out.println("Battery " + battery.load + " Battery2 " + battery2.load);
		battery.exchange(battery2,50);
		System.out.println("Battery " + battery.load + " Battery2 " + battery2.load);
	}
}
