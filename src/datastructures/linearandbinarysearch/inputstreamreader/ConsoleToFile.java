package datastructures.linearandbinarysearch.inputstreamreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleToFile {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter writer = new FileWriter("output.txt", true);

            String input;
            while (true) {
                input = br.readLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(input + System.lineSeparator());
            }

            writer.close();
            br.close();
            isr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
