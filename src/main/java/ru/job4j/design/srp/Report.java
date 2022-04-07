package ru.job4j.design.srp;

import java.io.IOException;

public interface Report {
    String generate() throws IOException;
}
