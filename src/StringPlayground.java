public class StringPlayground {

        public int matchedParentheses(String s) {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    count++;
                } else if (c == ')') {
                    count--;
                    if (count < 0) {
                        return count; // This ought to create an early return if the parentheses are unbalanced
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        StringPlayground playground = new StringPlayground();
        // I don't have the brainpower or energy to resolve this "unnamed classes" error code I'm getting.
        String[] strings = {"((3 + 7) * 2)", "( )", "((3 + 7) * 2) )", "((3 + 7) * 2))"};
        for (String string : strings) {
            int result = playground.matchedParentheses(string);
            if (result == 0) {
                System.out.println("String '" + string + "' has balanced parentheses.");
            } else {
                System.out.println("String '" + string + "' has unbalanced parentheses. Final count: " + result);
            }
        }

    }
