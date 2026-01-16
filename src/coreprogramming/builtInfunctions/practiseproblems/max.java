package coreprogramming.builtInfunctions.practiseproblems;
import java.time.LocalDate;
import java.util.Scanner;
public class Max {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();

            LocalDate date = LocalDate.of(year, month, day);

            LocalDate result = date
                    .plusDays(7)
                    .plusMonths(1)
                    .plusYears(2)
                    .minusWeeks(3);

            System.out.println("Original Date: " + date);
            System.out.println("Final Date   : " + result);

            sc.close();
        }
}

