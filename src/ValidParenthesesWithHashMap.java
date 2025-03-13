import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesesWithHashMap {
    public static boolean isValid(String s) {
        // Edge case: if the string length is odd, it cannot be valid
        if (s.length() % 2 != 0) {
            return false;
        }

        // Create a map to store the matching pairs
        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        // Stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through the string
        for (char c : s.toCharArray()) {
            // If it's a closing bracket
            if (bracketMap.containsKey(c)) {
                // Check the top of the stack (or assume '#' if the stack is empty)
                char top = stack.isEmpty() ? '#' : stack.pop();
                // If the top doesn't match the expected opening bracket, return false
                if (top != bracketMap.get(c)) {
                    return false;
                }
            } else {
                // If it's an opening bracket, push it onto the stack
                stack.push(c);
            }
        }

        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "({[]})";
        System.out.println("Is valid: " + isValid(input)); // Output: true
    }
}

