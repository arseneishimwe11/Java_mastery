package Exercises;

import java.util.Scanner;

public class Question_8 {
    //Printing from 1 to 10
    public static int num1, num2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
        System.out.println("After swapping the 1st number is: "+ num2);
        System.out.println("After swapping the 2nd number is: "+ num1);

    }
}
