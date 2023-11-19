package backTracking;

import java.util.Scanner;

public class Main {

    public static void computeDP(int[][] DP, String str) {
        int length = str.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                DP[i][j] = 0;
            }
        }

        for (int j = 1; j <= length; j++) {
            for (int i = 0; i <= length - j; i++) {
                if (j <= 2) {
                    if (str.charAt(i) == str.charAt(i + j - 1)) {
                        DP[i][i + j - 1] = 1;
                    }
                } else if (str.charAt(i) == str.charAt(i + j - 1)) {
                    DP[i][i + j - 1] = DP[i + 1][i + j - 2];
                }
            }
        }
    }

    public static void solveAllQueries(String str, int Q, int[][] query) {
        int[][] DP = new int[50][50];
        computeDP(DP, str);

        for (int i = 0; i < Q; i++) {
            if (DP[query[i][0] - 1][query[i][1] - 1] != 0) {
                System.out.println("not palindrome!");
            } else {
                System.out.println("palindrome!");
            }
        }
    }

    public static void main(String[] args) {
        String str = "heleltronrocop";
        int Q = 3;
        int[][] query = {{1, 3}, {0, 4}, {6, 10}};

        solveAllQueries(str, Q, query);
    }
}
