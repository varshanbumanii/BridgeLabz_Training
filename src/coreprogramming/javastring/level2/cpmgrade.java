package core_programming.javastring.level2;

public class cpmgrade {
    public static int[][] generateScores(int n) {
        int[][] m = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                m[i][j] = 10 + (int)(Math.random() * 90);
        return m;
    }

    public static double[][] calculate(int[][] m) {
        double[][] r = new double[m.length][3];

        for (int i = 0; i < m.length; i++) {
            int total = m[i][0] + m[i][1] + m[i][2];
            r[i][0] = total;
            r[i][1] = Math.round((total / 3.0) * 100) / 100.0;
            r[i][2] = Math.round((total / 300.0 * 100) * 100) / 100.0;
        }
        return r;
    }

    public static char grade(double p) {
        if (p >= 90) return 'A';
        if (p >= 75) return 'B';
        if (p >= 50) return 'C';
        return 'D';
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        double[][] res = calculate(scores);

        System.out.println("P C M Total Avg % Grade");
        for (int i = 0; i < scores.length; i++)
            System.out.println(scores[i][0] + " " +
                    scores[i][1] + " " +
                    scores[i][2] + " " +
                    res[i][0] + " " +
                    res[i][1] + " " +
                    res[i][2] + " " +
                    grade(res[i][2]));
    }
}
