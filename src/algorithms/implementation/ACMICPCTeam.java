package algorithms.implementation;

import java.util.Scanner;

public class ACMICPCTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstLine = sc.nextLine().split(" ");
        int numPeople = Integer.parseInt(firstLine[0]);
        int numTopic = Integer.parseInt(firstLine[1]);
        StringBuilder[] map = new StringBuilder[numPeople];

        for (int i = 0; i < numPeople; i++) {
            map[i] = new StringBuilder(sc.nextLine());
        }

        ACMICPCTeam s = new ACMICPCTeam();
        s.acmipc(map, numPeople, numTopic);
    }

    public void acmipc(StringBuilder[] topicMap, int numPeople, int numTopic) {
        int count = 0, max = 0, maxCount = 0;

        for (int i = 0; i < numPeople; i++) {
            for (int j = i + 1; j < numPeople; j++) {
                for (int k = 0; k < numTopic; k++) {
                    if (topicMap[i].charAt(k) == '1' || topicMap[j].charAt(k) == '1') {
                        count++;
                    }
                }
                if (max < count) {
                    max = count;
                    maxCount = 1;
                } else if (max == count && count != 0) {
                    maxCount++;
                }
                count = 0;
            }
        }
        System.out.println(max);
        System.out.println(maxCount);
    }
}
