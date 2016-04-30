package tutorial30daysofcode;

import java.util.Scanner;

public class Day4ClassInstance {
    private int age;

    public Day4ClassInstance(int initialAge) {
        // Add some more code to run some checks on initialAge
        // this.age = initialAge < 0 ? 0 : initialAge;
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = initialAge;
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        // String message = this.age < 13 ? young : teen;
        String young = "You are young.";
        String teen = "You are a teenager.";
        String old = "You are old.";
        String message;
        if (this.age < 13){
            message = young;
        }else if (this.age >=13 && this.age < 18){
            message = teen;
        }else{
            message = old;
        }
        System.out.println(message);
    }

    public void yearPasses() {
        // Increment this person's age.
        this.age += 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Day4ClassInstance p = new Day4ClassInstance(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
