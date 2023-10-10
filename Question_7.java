package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter a number : ");
            int number = scanner.nextInt();
            if(number > 0) {
                System.out.println("This number is greater than Zero!");
            }else if (number == 0) {
                System.out.println("This number is zero");
            }else {
                System.out.println("This number is less than Zero!");
            }
        }catch (InputMismatchException exception){
            System.out.println("Error: Please enter a number!");
        }

    }
}

