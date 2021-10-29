package ru.job4j.collection.Set;

import java.util.HashSet;
import java.util.Collection;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String word : origin)  {
            check.add(word);
        }
        for (String word : text) {
            if (! check.contains(word)) {
                rsl = false;
            }
        }
        return rsl;
    }
}
