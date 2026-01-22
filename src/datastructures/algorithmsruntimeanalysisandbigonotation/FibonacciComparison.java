package datastructures.algorithmsruntimeanalysisandbigonotation;

public class FibonacciComparison {
    public static void main(String[] args) {

        int[] values = {10, 30};

        for (int n : values) {

            long recStart = System.nanoTime();
            int recResult = fibonacciRecursive(n);
            long recEnd = System.nanoTime();

            long itrStart = System.nanoTime();
            int itrResult = fibonacciIterative(n);
            long itrEnd = System.nanoTime();

            System.out.println("N = " + n);
            System.out.println("Recursive Result: " + recResult);
            System.out.println("Recursive Time (ns): " + (recEnd - recStart));
            System.out.println("Iterative Result: " + itrResult);
            System.out.println("Iterative Time (ns): " + (itrEnd - itrStart));
            System.out.println();
        }

        int largeN = 50;

        long itrStart = System.nanoTime();
        int itrResult = fibonacciIterative(largeN);
        long itrEnd = System.nanoTime();

        System.out.println("N = " + largeN);
        System.out.println("Iterative Result: " + itrResult);
        System.out.println("Iterative Time (ns): " + (itrEnd - itrStart));
    }

    static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    static int fibonacciIterative(int n) {
        if (n <= 1) return n;

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }

        return b;
    }
}

