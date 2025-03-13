package StringManipulation;

public class PalindromeChecker {
    public static boolean checkPalindrome(String input){
        char[] ch = input.replaceAll("\\s","").toLowerCase().toCharArray();//race car
        int end = ch.length-1;
        for(int start=0; start<end; start++,end--){
            if(ch[start]!=ch[end]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome("Race cars"));
    }
}
