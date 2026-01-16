package DataStructures.queue_stack_hash_hashinfunctions.stackandqueue;

import java.util.Stack;

public class StockSpan {

    public static void calculateSpan(int[] price) {

        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {

            while (!stack.isEmpty() && price[i] >= price[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        System.out.println("Stock Prices:");
        for (int p : price) {
            System.out.print(p + " ");
        }

        System.out.println("\nStock Span:");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {

        int[] price = {100, 80, 60, 70, 60, 75, 85};
        calculateSpan(price);
    }
}

