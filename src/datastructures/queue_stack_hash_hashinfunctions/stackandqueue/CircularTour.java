package datastructures.queue_stack_hash_hashinfunctions.stackandqueue;

public class CircularTour {

    static int findStartPoint(int[] petrol, int[] distance) {

        int balance = 0;
        int deficit = 0;
        int start = 0;

        for (int i = 0; i < petrol.length; i++) {

            balance += petrol[i] - distance[i];

            if (balance < 0) {
                deficit += balance;
                start = i + 1;
                balance = 0;
            }
        }

        if (balance + deficit >= 0)
            return start;
        else
            return -1;
    }

    public static void main(String[] args) {

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStartPoint(petrol, distance);

        if (start == -1) {
            System.out.println("No circular tour possible.");
        } else {
            System.out.println("Start at petrol pump index: " + start);
        }
    }
}

