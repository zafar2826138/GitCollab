package zac;

public class Task {

        public static int calculateExpression(String s) {
            s = s.replace("one", "1").replace("two", "2");

            int result = 0;
            int current = 0;
            char operator = '+';

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (Character.isDigit(ch)) {
                    current = Character.getNumericValue(ch);

                    // Apply previous operator
                    if (operator == '+') {
                        result += current;
                    } else if (operator == '-') {
                        result -= current;
                    }
                } else if (ch == '+' || ch == '-') {
                    operator = ch;
                }
            }

            return result;
        }

        public static void main(String[] args) {
            String input = "one+two-one+two+two-one+one+one";
            int result = calculateExpression(input);
            System.out.println("Result: " + result);  // Output: 2
        }
    }

