package datastructures.algorithmsruntimeanalysisandbigonotation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class FileReadingPerformance {
    public static void main(String[] args) {

        String filePath = "Somesh_OPED_ECOFIN_Day1.docx";

        long frStart = System.nanoTime();
        int frWords = readUsingFileReader(filePath);
        long frEnd = System.nanoTime();

        long isrStart = System.nanoTime();
        int isrWords = readUsingInputStreamReader(filePath);
        long isrEnd = System.nanoTime();

        System.out.println("FileReader Word Count: " + frWords);
        System.out.println("FileReader Time (ns): " + (frEnd - frStart));

        System.out.println("InputStreamReader Word Count: " + isrWords);
        System.out.println("InputStreamReader Time (ns): " + (isrEnd - isrStart));
    }

    static int readUsingFileReader(String filePath) {
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    count += line.trim().split("\\s+").length;
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }
        return count;
    }

    static int readUsingInputStreamReader(String filePath) {
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(filePath), "UTF-8")
            );
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    count += line.trim().split("\\s+").length;
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }
        return count;
    }
}

