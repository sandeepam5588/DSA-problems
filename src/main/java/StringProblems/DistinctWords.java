package StringProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


/*
    Input: Java is great. Grails is also great
    Output: Java
            Grails
            also
 */
public class DistinctWords {
    public static void main(String[] args) {
        String str = "Java is great. Grails is also great";
        distinctWords(str);
    }

    private static void distinctWords(String sentence) {
        sentence = sentence.replaceAll("^\\.+|\\.+$", "");
        Map<String, Integer> wordCount = new HashMap<>();
        for(String word : sentence.split(" ")){
            word = word.replaceAll("^\\.+|\\.+$", "");
            wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
        }
        wordCount.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }

    private static void distinctWordsUsingStream(String sentence) {
        // Remove leading and trailing dots from the entire sentence
        sentence = sentence.replaceAll("^\\.+|\\.+$", "");

        // Process words using streams
        Arrays.stream(sentence.split("\\s+")) // Split sentence into words
                .map(word -> word.replaceAll("^\\.+|\\.+$", "")) // Remove leading and trailing dots from each word
                .filter(word -> !word.isEmpty()) // Filter out empty words if any
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Count occurrences of each word
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1) // Keep only words with count 1
                .map(Map.Entry::getKey) // Get the word itself
                .forEach(System.out::println); // Print each word
    }


}
