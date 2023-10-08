package ru.rosbank_homework_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListRealization {
    public static List<String> stringArray = new ArrayList<>(Arrays.asList("pop",  "dod", " gog", "pop", "cat",
            "TOM", " dog", "DOM", "flAT", "FFFFF",
            "summer", "summer", "summer", "winter", "spring",
            "ll", "lll", "rare", "String", "Integer"));


    public static void main(String[] args) {

        WordsInArray.findRepeat(stringArray);
    }

  /*  public static int wordCounter(String targetWord) {
        int counter = 0;
        for (int i = 0; i < stringArray.size(); i++) {
            if (stringArray.get(i).equals(targetWord)) {
                counter++;
            }
        }
        return counter;
    }*/
}
