package StringManipulation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInString {
    public static String reverseSolution(String input){
        return Arrays.stream(input.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
    public static void main(String[] args) {
        System.out.println(reverseSolution("Hi this is weird"));
    }
}
