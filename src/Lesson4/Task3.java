package Lesson4;

import java.util.Random;

public class Task3 {
    public static int minValue(int[] massive){
        int min = massive[0];
        for (int i = 0; i > massive.length; i++){
            if (min > massive[i]){
                min = massive[i];
            }
        }
       return min;
    }
    public static int maxValue(int[] massive){
        int max = massive[0];
        for (int i = 0; i < massive.length; i++){
            if (max < massive[i]){
                max = massive[i];
            }
        }
        return max;

    }
    public static int average(int[] massive){
        int sum = 0;
        for (int i = 0; i < massive.length; i++){
            sum += massive[i];

            }
        int average = sum/massive.length;
        return average;
        }


    public static int [] generateArray(int lenght){
        Random randomGenerator = new Random();
        int[] ourArray = new int[lenght];
        for (int i = 0; i < lenght; i++){
            ourArray[i] = randomGenerator.nextInt(100);
        }
        return ourArray;
        }


    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5, 6, 28, 176, 798};
        int min = minValue(elements);
        int max = maxValue(elements);
        int averageNumber = average(elements);
        System.out.println("Min value is " + min );
        System.out.println("Max value is " + max );
        System.out.println("Average value is " + averageNumber );

        int[] myElements = generateArray(10);
        int min1 = minValue(myElements);
        int max1 = maxValue(myElements);
        int averageNumber1 = average(myElements);
        System.out.println("Min value is " + min );
        System.out.println("Max value is " + max );
        System.out.println("Average value is " + averageNumber1 );

    }
}
