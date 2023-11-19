package backTracking;

import java.util.Scanner;

public class findword {
	
	public static int findPath(char[][] grid, String word) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == word.charAt(0)) {
                    count += dfs(grid, word, i, j, 0);
                }
            }
        }
        return count;
    }
	

    public static int dfs(char[][] grid, String word, int i, int j, int k) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != word.charAt(k)) {
            return 0;
        }

        if (k == word.length() - 1) {
            return 1;
        }

        int count = 0;
        char originalChar = grid[i][j];
        grid[i][j] = '#';

        count += dfs(grid, word, i - 1, j, k + 1); // Up
        count += dfs(grid, word, i + 1, j, k + 1); // Down
        count += dfs(grid, word, i, j - 1, k + 1); // Left
        count += dfs(grid, word, i, j + 1, k + 1); // Right

        grid[i][j] = originalChar;

        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        int n = Integer.parseInt(scanner.nextLine());
        char[][] grid = new char[n][];
        for (int i = 0; i < n; i++) {
            String row = scanner.nextLine();
            grid[i] = row.toCharArray();
        }
        String word = scanner.nextLine();

        // Count the occurrences of the word in the grid
        int occurrences = findPath(grid, word);

        // Print the result
        System.out.println(occurrences);
    }


}




