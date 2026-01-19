package week_2.sheet1;

public class remove_outermost_parentheses {
      public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if(!st.isEmpty()) {
                    sb.append(ch); // not outermost
                }
                st.push(ch);
            } else if (ch == ')') {
                st.pop();
                if (!st.isEmpty()) {
                    sb.append(ch); // not outermost
                }
            }
        }

        return sb.toString();
    }
}
