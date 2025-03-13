package StringManipulation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicateCharFromString {
    public static String solution(String input){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(Character ch : input.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,0);
            }
        }
        StringBuilder result = new StringBuilder();
        map.forEach((k,v)-> result.append(k));
        return result.toString();
//        return map.entrySet().stream()
//                .map(entry -> String.valueOf(entry.getKey()))
//                .collect(Collectors.joining());
    }
    public static void main(String[] args) {
        System.out.println(solution("bananna"));
    }
}
