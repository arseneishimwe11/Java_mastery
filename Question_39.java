package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_39 {
    public static int a, number, sign=1;
    public static void main(String[] args) {
        //Reversing integer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        number = scanner.nextInt();
        if (number < 0) {
            sign = -1;
            number = -number;
        }
        ArrayList<String> new_Int = new ArrayList<>();
        String num_to_string = Integer.toString(number);
        for (a =num_to_string.length()-1; a>=0 ;a--) {
            new_Int.add(String.valueOf(num_to_string.charAt(a)));
        }
        String reversed_Int_string = String.join("", new_Int);
        int reversed_Int = Integer.parseInt(reversed_Int_string) * sign;
        System.out.println("The reversed number is: " + reversed_Int);
    }
}
