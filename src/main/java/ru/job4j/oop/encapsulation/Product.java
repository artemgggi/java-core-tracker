package ru.job4j.oop.encapsulation;

import java.util.Arrays;
import java.util.Objects;

public class Product {
	private String name;
	private int count;

	public Product(String name, int count) {
		this.name = name;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return count == product.count && Objects.equals(name, product.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, count);
	}
}

class Shop {
	public static void main(String[] args) {
		Product[] products = new Product[5];
		products[0] = new Product("Milk", 10);
		products[1] = new Product("Bread", 4);
		products[2] = new Product("Egg", 19);
		for (int i = 0; i < products.length; i++) {
			Product product = products[i];
			/* проверяем, что объект не равен null. Т.к. у нас массив не заполнен целиком. */
			if (product != null) {
				System.out.println(product.getName());
			}
		}
	}

	public static int indexOfNull(Product[] products) {
		int res = -1;
		for (int i = 0; i < products.length; i++) {
			Product product = products[i];
			if (product == null) {
				res = i;
				break;
			}
		}
		return res;
	}
}

class ShopDrop {
	public static Product[] delete(Product[] products, int index) {
		products[index] = null;
		for (int i = 0; i < products.length; i++) {
			for (int j = products.length - 1; j > 0; j--) {
				if (products[j - 1] == null) {
					products[j - 1] = products[j];
					products[j] = null;
				}
			}
		}
		return products;
	}
}
