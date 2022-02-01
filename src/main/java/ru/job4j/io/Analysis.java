package ru.job4j.io;

import java.io.*;

public class Analysis {
    public void unavailable(String source, String target) throws FileNotFoundException {
        String key = null;
        try (PrintWriter out = new PrintWriter(new FileOutputStream(target))) {
            try (BufferedReader in =
                         new BufferedReader(new FileReader(source))) {
                String line = in.readLine();
                while (line != null) {
                    int index = line.indexOf(" ");
                    String error = line.substring(0, index);
                    String el = line.substring(index + 1);
                    if (error.equals("400") || error.equals("500")) {
                        if (key == null) {
                            key = el;
                        }
                    } else
                    if (key != null) {
                        out.println(key + ";" + el + ";");
                        key = null;
                    }
                    line = in.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("No file");
        }
    }

    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter(new FileOutputStream("unavailable.csv"))) {
            new Analysis().unavailable("./data/server_log", "./data/server_log_result");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
