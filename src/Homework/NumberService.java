package Homework;

import java.util.Scanner;

public class NumberService {
    public int rangeSum(int start, int finish) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        start = scanner.nextInt();
        System.out.print("Enter ending number : ");
        int end = scanner.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++)
            sum = sum + i;
        System.out.print("Sum of numbers in the range from " + start + " to " + end + " is " + sum);
        scanner.close();
        return end;
    }

    public int rangeEvenCount(int start, int finish) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        start = scanner.nextInt();
        System.out.print("Enter ending number : ");
        int end = scanner.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++)
            sum = sum + i;
        if (start == finish) {
            sum = sum / 2;
            System.out.print("Even count of numbers in the range from " + start + " to " + end + " is " + sum);
            scanner.close();

        }
        return end;
    }
}




