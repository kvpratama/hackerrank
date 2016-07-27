package hrjava.oop;

import java.util.Scanner;

public class JavaInterface {
    interface AdvancedArithmetic {
        int divisor_sum(int n);
    }

    //Write your code here
    class MyCalculator implements AdvancedArithmetic {
        public int divisor_sum(int n) {
            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum + n;
        }
    }

    class Solution {
        public void main(String[] args) {
            MyCalculator my_calculator = new MyCalculator();
            System.out.print("I implemented: ");
            ImplementedInterfaceNames(my_calculator);
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.print(my_calculator.divisor_sum(n) + "\n");
            sc.close();
        }

        /*
         *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
         */
        void ImplementedInterfaceNames(Object o) {
            Class[] theInterfaces = o.getClass().getInterfaces();
            for (Class theInterface : theInterfaces) {
                String interfaceName = theInterface.getName();
                System.out.println(interfaceName);
            }
        }
    }
}
