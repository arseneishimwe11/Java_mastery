package Exercises;

import java.util.Scanner;

public class Question_28 {
    public static int length;
    public static int str_len(String string){
        char[] string_char = string.toCharArray();
        while(true){
            try {
                char character = string_char[length];
                length ++;
            }catch (ArrayIndexOutOfBoundsException e){
                break;
            }
    }
        return length;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        int length = str_len(string);
        System.out.println("Length of the string: " + length);
    }
}
