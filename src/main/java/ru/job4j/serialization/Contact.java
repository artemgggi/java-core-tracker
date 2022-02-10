package ru.job4j.serialization;

import java.io.*;
import java.nio.file.Files;

public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;
	private final int ZipCode;
	private final String phone;

	public Contact(int zipCode, String phone) {
		ZipCode = zipCode;
		this.phone = phone;
	}

	public int getZipCode() {
		return ZipCode;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Contact{" +
				"ZipCode=" + ZipCode +
				", phone='" + phone + '\'' +
				'}';
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		final Contact contact = new Contact(603000, "+ 7(111)11-11-11");
		/* Запись объекта во временный файл, который удалится системой */
		File tempFile = Files.createTempFile(null, null).toFile();
		try (FileOutputStream fos = new FileOutputStream(tempFile);
		     ObjectOutputStream oos =
				     new ObjectOutputStream(fos)) {
			oos.writeObject(contact);
		}

		/* Чтение объекта из файла */
		try (FileInputStream fis = new FileInputStream(tempFile);
		     ObjectInputStream ois =
				     new ObjectInputStream(fis)) {
			final Contact contactFromFile = (Contact) ois.readObject();
			System.out.println(contactFromFile);
		}
	}
}
