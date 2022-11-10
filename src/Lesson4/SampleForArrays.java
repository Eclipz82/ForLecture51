package Lesson4;

public class SampleForArrays {
    public static void main(String[] args) {
        int[] elements = {1,2,3,4,5,6,7,8,10,56,2984};
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
            System.out.println("Current element is " + i + " Sum is " + sum);
        }
        sum = 0;
        for (int element : elements) {
            sum += element;
            System.out.println("Sum is " + sum);



        }
    }
}
