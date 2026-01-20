package week_2.sheet1;

import java.util.Stack;

public class remove_outermost_parentheses {
    public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        // Traverse each character of the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // If opening bracket
            if (ch == '(') {
                // If stack is not empty, it is NOT outermost
                if (!st.isEmpty()) {
                    sb.append(ch);
                }
                // Push '(' to stack
                st.push(ch);
            }
            // If closing bracket
            else if (ch == ')') {

                // Remove matching '('
                st.pop();
                // If stack is not empty, it is NOT outermost
                if (!st.isEmpty()) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        // Example input
        String s = "(()())(())";
        //its output is ()()() we removed 
        String result = removeOuterParentheses(s);
        System.out.println("Result: " + result);
    }
}













//next greater 
/* 
 public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans2[] = new int[nums1.length];
        return nextGreater(nums1, ans2, nums2);
    }
    
    // to calculate next greater elements
    private static int[] nextGreater(int[] nums1, int[] ans2, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[nums2.length];
        // Traverse nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {
            // Remove smaller or equal elements
            while (!st.isEmpty() && nums2[i] >= nums2[st.peek()]) {
                st.pop();
            }
            // If stack empty → no greater element
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = nums2[st.peek()];
            }
            // Push index of current element
            st.push(i);
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    ans2[i] = ans[j];
                }
            }
        }
        return ans2;
    }
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        // Call function directly (no object)
        int[] result = nextGreaterElement(nums1, nums2);
        //Next greater elements----->
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    */