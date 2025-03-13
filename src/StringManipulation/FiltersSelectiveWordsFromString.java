package StringManipulation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FiltersSelectiveWordsFromString {
    public static String filterLogic(String input){
        return Arrays.stream(input.split(" "))
                .filter((word -> word.startsWith("c")))
                .filter(word -> word.length()==3)
                .distinct()
                .collect(Collectors.joining(" "));
    }
    public static void main(String[] args) {
        System.out.println(filterLogic("cat eating carrot also it cares another cat so it shares it"));
    }
}
