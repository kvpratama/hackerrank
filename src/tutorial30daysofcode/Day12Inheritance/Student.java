package tutorial30daysofcode.Day12Inheritance;

public class Student extends Person {

    private int[] testScores;

    Student(String firstName, String lastName, int identification) {
        super(firstName, lastName, identification);
    }

    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.testScores = scores;
    }

    public char calculate() {
        int sum = 0, avg, len = this.testScores.length;

        for (int i : this.testScores) {
            sum += i;
        }

        avg = sum / len;

        if (90 <= avg && avg <= 100) {
            return 'O';
        } else if (80 <= avg && avg < 90) {
            return 'E';
        } else if (70 <= avg && avg < 80) {
            return 'A';
        } else if (55 <= avg && avg < 70) {
            return 'P';
        } else if (40 <= avg && avg < 55) {
            return 'D';
        } else {
            return 'T';
        }
    }
}
