package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_38 {
    public static double difference_of_sum_even_odd(ArrayList<Integer> arrayList) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        System.out.println(arrayList);
        for (Integer value : arrayList) {
            if (value % 2 == 0) {
                even.add(value);
            }else{
                odd.add(value);
            }
        }
        double even_sum = 0, odd_sum = 0;
        for (Integer integer : even) {
            even_sum += integer;
        }
        for (Integer integer : odd) {
            odd_sum += integer;
        }
        return odd_sum - even_sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        inputList.add(num1);
        inputList.add(num2);
        inputList.add(num3);
        inputList.add(num4);
        inputList.add(num5);
        double difference = difference_of_sum_even_odd(inputList);
        System.out.println("The difference between the sum of even and odd is " + difference);
    }
}
