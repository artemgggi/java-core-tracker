package ru.job4j.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LogFilter {
    public static List<String> filter(String file) {
        List<String> resultList = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            resultList = in
                    .lines()
                    .filter(s ->
                            s.contains("404")
                                    && !s.contains("404 -")
                    )
                    .collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultList;
    }

    public static void save(List<String> log, String file) {
        try (PrintWriter out = new PrintWriter(
                new BufferedOutputStream(
                        new FileOutputStream(file)
                ))) {
            for (String line : log) {
                out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String> log = filter("log.txt");
        LogFilter.save(log, "LogFiltering.txt");
        System.out.println(log);
    }
}
