package ru.job4j.io;

import java.io.*;

public class ParseFile {

    private final File FILE;

    public ParseFile(File file) {
        this.FILE = file;
    }

    public String getContent() throws IOException {
        StringBuilder output = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(FILE))) {
            int data;
            while ((data = in.read()) > 0) {
                output.append((char) data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output.toString();
    }

    public String getContentWithoutUnicode() throws IOException {
        StringBuilder output = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(FILE))) {
            int data;
            while ((data = in.read()) > 0) {
                if (data < 0x80) {
                    output.append((char) data);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output.toString();
    }

    public void saveContent(String content) throws IOException {
        OutputStream o = new FileOutputStream(FILE);
        for (int i = 0; i < content.length(); i += 1) {
            o.write(content.charAt(i));
        }
    }
}
