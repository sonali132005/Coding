import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> str = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                str.push(ch);
            } 
            else {
                if (str.size() == 0) return false;

                if (ch == ')' && str.peek() == '(') str.pop();
                else if (ch == '}' && str.peek() == '{') str.pop();
                else if (ch == ']' && str.peek() == '[') str.pop();
                else return false;
            }
        }

        return str.size() == 0;
    }
}