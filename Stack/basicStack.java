public class basicStack {
    static int stack[], top;

    static class Stack {
        Stack(int capacity) {
            stack = new int[capacity];
            top = -1;
        }

        public void push(int num) {
            if (top < stack.length - 1) {
                top++;
                stack[top] = num;
            }
        }

        public int pop() {
            int ele = -1;
            if (top >= 0) {
                ele = stack[top];
                top--;
            }
            return ele;
        }

        public int top() {
            return top >= 0 ? stack[top] : -1;
        }

        public int isEmpty() {
            return top == -1 ? 1 : 0;
        }

        public int isFull() {
            return top == stack.length - 1 ? 1 : 0;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop()); // prints 3
        System.out.println(s.top()); // prints 2
        System.out.println(s.isEmpty()); // prints 0
        System.out.println(s.isFull()); // prints 0
    }
}
