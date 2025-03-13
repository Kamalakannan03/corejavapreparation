package StringManipulation;

public class ReverseSimpleString {
    public static String simpleReverseString(String input){
        return new StringBuilder(input).reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(simpleReverseString("hello"));
    }
}
