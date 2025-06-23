import java.util.Stack;

public class ParenthesesMatcher {
    public static void main(String[] args) {
        String expr1 = "(a + b) * (c + d)";
        String expr2 = "((a + b) * (c + d)";

        System.out.println("Expression: " + expr1 + " -> Balanced: " + isBalanced(expr1));
        System.out.println("Expression: " + expr2 + " -> Balanced: " + isBalanced(expr2));
    }

    static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
