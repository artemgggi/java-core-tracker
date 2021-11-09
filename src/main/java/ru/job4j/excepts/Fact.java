package ru.job4j.excepts;

public class Fact {
    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("число должно быть больше нуля");
        }
        int rsl = 1;
        for (int i = 0; i <= n; i++) {
            rsl *= i;
        }
        return rsl;
    }
}
