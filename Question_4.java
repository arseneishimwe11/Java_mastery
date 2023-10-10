package Exercises;

import java.util.Scanner;

public class Question_4 {
    public static int num1;
    public static int num2;
    public static char choice;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter the first number: " );
            num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            num2 = scanner.nextInt();
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
            System.out.println("Do you want to continue ? Y/N");
            choice = scanner.next().charAt(0);
        }while (choice == 'Y');
    }
}
