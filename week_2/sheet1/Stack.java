package ICP_2026.week_2;

public class Stack<T> {

    private T[] arr;
    private int top;

    public Stack() {
        arr = (T[]) new Object[30]; // unchecked cast is OK here
        top = -1;
    }

    public void push(T val) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = val;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        }
        return arr[top];
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        }
        return arr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        System.out.println(st.pop());
    }
}

