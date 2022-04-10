package ru.job4j.io;

import java.io.*;

public class ParseFile {

    private final File FILE;

    public ParseFile(File file) {
        this.FILE = file;
    }

    public String getContent() throws IOException {
        InputStream i = new FileInputStream(FILE);
        String output = "";
        int data;
        while ((data = i.read()) > 0) {
            output += (char) data;
        }
        return output;
    }

    public String getContentWithoutUnicode() throws IOException {
        InputStream i = new FileInputStream(FILE);
        String output = "";
        int data;
        while ((data = i.read()) > 0) {
            if (data < 0x80) {
                output += (char) data;
            }
        }
        return output;
    }

    public void saveContent(String content) throws IOException {
        OutputStream o = new FileOutputStream(FILE);
        for (int i = 0; i < content.length(); i += 1) {
            o.write(content.charAt(i));
        }
    }
}
