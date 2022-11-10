import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
//        int number1 = 34;
//        int number2 = 14;
//        int sum = number1 + number2;
//        System.out.println(sum);

        Random randomGeneration = new Random();
        int randomNumber1 = randomGeneration.nextInt(101);
        int randomNumber2 = randomGeneration.nextInt(101);
        int sum = randomNumber1 + randomNumber2;
        System.out.println("Sum of 2 random number is " + sum) ;

    }
}
