package ru.job4j.io;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class BasicOutput {
    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("res.txt")) {
            out.write("sample text".getBytes(StandardCharsets.UTF_8));
            out.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
