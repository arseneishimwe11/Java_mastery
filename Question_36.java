package Exercises;

import java.util.Scanner;

public class Question_36 {
    public static double sum = 0;
    public static double square = 0, sum_of_the_square = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit N: ");
        int limit = scanner.nextInt();
        for(int a=1; a<=limit; a++){
            sum += a;
            square = Math.pow(a, 2);
            sum_of_the_square += square;

        }
        double square_of_the_sum = Math.pow(sum , 2);
        double difference = square_of_the_sum - sum_of_the_square;
        System.out.println("The difference between the square of the sum and the sum of the square is of the first " + limit + " natural numbers is: " + difference);

    }
}
