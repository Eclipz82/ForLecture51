package Homework;

import java.util.Scanner;

public class NumberService2 {
    public int rangeSum(int start, int finish) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        start = scanner.nextInt();
        System.out.print("Enter finish number : ");
        finish = scanner.nextInt();
        int result = 0;
        for (int i = start; i <= finish; i++) {
            result += i;
            System.out.print("Sum of numbers in the range from " + start + " to " + finish + " is " + result);
            scanner.close();
        }
        return result;
    }

    public int rangeEvenCount(int start, int finish) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        start = scanner.nextInt();
        System.out.print("Enter finish number : ");
        finish = scanner.nextInt();
        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                result++;
                System.out.print("Even count of numbers in the range from " + start + " to " + finish + " is " + result);
                scanner.close();
            }
        }
        return result;
    }
}