package datastructures.linearandbinarysearch.stringbuffer;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {

        int n = 1_000_000;

        long startBuffer = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            buffer.append("hello");
        }
        long endBuffer = System.nanoTime();

        long startBuilder = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append("hello");
        }
        long endBuilder = System.nanoTime();

        long bufferTime = endBuffer - startBuffer;
        long builderTime = endBuilder - startBuilder;

        System.out.println("StringBuffer Time (ns): " + bufferTime);
        System.out.println("StringBuilder Time (ns): " + builderTime);
    }
}
