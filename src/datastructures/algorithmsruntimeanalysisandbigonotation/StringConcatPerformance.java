package datastructures.algorithmsruntimeanalysisandbigonotation;

public class StringConcatPerformance {
    public static void main(String[] args) {

        int[] sizes = {1000, 10000};

        for (int n : sizes) {

            long stringStart = System.nanoTime();
            String s = "";
            for (int i = 0; i < n; i++) {
                s = s + "hello";
            }
            long stringEnd = System.nanoTime();

            long builderStart = System.nanoTime();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                builder.append("hello");
            }
            long builderEnd = System.nanoTime();

            long bufferStart = System.nanoTime();
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < n; i++) {
                buffer.append("hello");
            }
            long bufferEnd = System.nanoTime();

            System.out.println("Operations: " + n);
            System.out.println("String Time (ns): " + (stringEnd - stringStart));
            System.out.println("StringBuilder Time (ns): " + (builderEnd - builderStart));
            System.out.println("StringBuffer Time (ns): " + (bufferEnd - bufferStart));
            System.out.println();
        }
    }
}

