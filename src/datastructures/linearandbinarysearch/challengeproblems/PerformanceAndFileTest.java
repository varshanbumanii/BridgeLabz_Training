package datastructures.linearandbinarysearch.challengeproblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class PerformanceAndFileTest {
    public static void main(String[] args) {

        int n = 1_000_000;

        long sbStart = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append("hello");
        }
        long sbEnd = System.nanoTime();

        long sbufferStart = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            buffer.append("hello");
        }
        long sbufferEnd = System.nanoTime();

        System.out.println("StringBuilder Time (ns): " + (sbEnd - sbStart));
        System.out.println("StringBuffer Time (ns): " + (sbufferEnd - sbufferStart));

        String filePath = "largefile.txt";

        long frStart = System.nanoTime();
        int wordCountFR = countWordsUsingFileReader(filePath);
        long frEnd = System.nanoTime();

        long isrStart = System.nanoTime();
        int wordCountISR = countWordsUsingInputStreamReader(filePath);
        long isrEnd = System.nanoTime();

        System.out.println("FileReader Word Count: " + wordCountFR);
        System.out.println("FileReader Time (ns): " + (frEnd - frStart));

        System.out.println("InputStreamReader Word Count: " + wordCountISR);
        System.out.println("InputStreamReader Time (ns): " + (isrEnd - isrStart));
    }

    static int countWordsUsingFileReader(String filePath) {
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    count += words.length;
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }
        return count;
    }

    static int countWordsUsingInputStreamReader(String filePath) {
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(filePath), "UTF-8")
            );
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    count += words.length;
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }
        return count;
    }
}

