package algorithms.implementation;

import java.util.Scanner;

public class TheGridSearch {
    public static void main(String[] args) {
        TheGridSearch solution = new TheGridSearch();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String[] inputLine = sc.nextLine().split(" ");

            int[][] largerGrid = new int[Integer.parseInt(inputLine[0])][Integer.parseInt(inputLine[1])];
            for (int j = 0; j < largerGrid.length; j++) {
                String inputLine1 = sc.nextLine();
                for (int k = 0; k < largerGrid[0].length; k++) {
                    largerGrid[j][k] = Integer.parseInt(inputLine1.substring(k, k + 1));
                }
            }
            String[] inputLine2 = sc.nextLine().split(" ");
            int[][] pattern = new int[Integer.parseInt(inputLine2[0])][Integer.parseInt(inputLine2[1])];
            for (int j = 0; j < pattern.length; j++) {
                String inputLine3 = sc.nextLine();

                for (int k = 0; k < pattern[0].length; k++) {
                    pattern[j][k] = Integer.parseInt(inputLine3.substring(k, k + 1));
                }
            }
            solution.gridSearch(largerGrid, pattern);
        }
    }

    public boolean gridSearch(int[][] largerGrid, int[][] pattern) {

        for (int i = 0; i < largerGrid.length - 1; i++) {
            for (int j = 0; j < largerGrid[0].length - pattern[0].length + 1; j++) {
                if (largerGrid[i][j] == pattern[0][0]) {
                    if (checkPattern(largerGrid, pattern, i, j)) {
                        System.out.println("YES");
                        return true;
                    }
                }

            }
        }
        System.out.println("NO");
        return false;
    }

    public boolean checkPattern(int[][] largerGrid, int[][] pattern, int i, int j) {
        int count = 0;
        for (int k = 0; k < pattern.length; k++) {
            for (int l = 0; l < pattern[0].length; l++) {
                if (largerGrid[i + k][j + l] == pattern[k][l]) {
                    count++;
                } else {
                    count = 0;
                    break;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        return true;
    }
}
