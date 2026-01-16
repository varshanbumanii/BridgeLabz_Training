package coreprogramming.javastring.level2;

public class StudentVoting {
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++)
            ages[i] = 10 + (int)(Math.random() * 40);
        return ages;
    }

    public static String[][] checkVoting(int[] ages) {
        String[][] data = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            data[i][0] = String.valueOf(ages[i]);
            data[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return data;
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] result = checkVoting(ages);

        System.out.println("Age\tStatus");
        for (String[] row : result)
            System.out.println(row[0] + "\t" + row[1]);
    }
}
