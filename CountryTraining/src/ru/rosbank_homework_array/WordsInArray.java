package ru.rosbank_homework_array;



import java.util.HashMap;
import java.util.List;



public class WordsInArray {
    public static void findRepeat(List<String> words) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String word : words) {
            result.compute(word, (key, value) -> value == null? 1 : value + 1);
        }
        System.out.println(result);
    }
}
