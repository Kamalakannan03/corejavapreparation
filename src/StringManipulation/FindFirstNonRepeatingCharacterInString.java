package StringManipulation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FindFirstNonRepeatingCharacterInString {
    public static String solution(String input){
        Map<Character,Integer> map = new LinkedHashMap<>();
        //map will take counts of each char and iterate it to return first char which is having value of 1
        for(char ch : input.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Optional<Map.Entry<Character,Integer>> result = map.entrySet().stream()
                .filter(entry -> entry.getValue()==1)
                        .findFirst();
        return result.get().getKey().toString();
    }
    public static void main(String[] args) {
        System.out.println(solution("swiss"));
    }
}
