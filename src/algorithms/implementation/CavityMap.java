package algorithms.implementation;

import java.util.Scanner;

public class CavityMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        StringBuilder[] map = new StringBuilder[t];

        for (int i = 0; i < map.length; i++) {
            map[i] = new StringBuilder(sc.nextLine());
        }

        CavityMap solution = new CavityMap();
        solution.cavityMap(map);
    }

    public void cavityMap(StringBuilder[] map) {
        int mapLength = map.length;

        for (int i = 1; i < mapLength - 1; i++) {
            for (int j = 1; j < mapLength - 1; j++) {
                char tempChar = map[i].charAt(j);
                if (tempChar > map[i - 1].charAt(j) &&
                        tempChar > map[i].charAt(j + 1) &&
                        tempChar > map[i + 1].charAt(j) &&
                        tempChar > map[i].charAt(j - 1)) {
                    map[i].setCharAt(j, 'X');
                }
            }
        }

        for (int i = 0; i < mapLength; i++) {
            System.out.println(map[i]);
        }
    }
}
