package StringManipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindGivenStringIsAnagram {
    public static Boolean solution(String str1,String str2){
        if(str1.length()!=str2.length()) {
            return false;
        }
        if(sortedString(str1).equals(sortedString(str2))){
            return true;
        }
        return false;
    }
    public static String sortedString(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    public static Boolean anotherSolution(String str1,String str2){
        Map<Character,Integer> map = new HashMap<>();
        if(str1.length()!=str2.length())
            return false;
       for(int i=0; i<str1.length();i++){
            map.put(str1.charAt(i),map.getOrDefault(str1.charAt(i),0)+1);
            map.put(str2.charAt(i),map.getOrDefault(str2.charAt(i),0)-1);
        }
       for(int v: map.values()){
           if(v != 0){
               return false;
           }
       }
       return true;
    }
    public static void main(String[] args) {
        System.out.println("regular==>"+solution("worth","throw"));
        System.out.println("optimized==>"+anotherSolution("worth","throw"));
    }
}
