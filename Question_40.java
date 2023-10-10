package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_40 {
    public static ArrayList<Integer> factors_of(int num){
        ArrayList<Integer> array = new ArrayList<>();
        for(int j = 1;j <= num;j++){
            if(num % j == 0){
                array.add(j);
            }
        }
        return array;
    }
    public static boolean hasFactor3 = false;
    public static boolean hasFactor5 = false;
    public static boolean hasFactor7 = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        ArrayList<Integer> factors_array =  factors_of(num);

        for(Integer integer: factors_array) {
            if (integer == 3) {
                hasFactor3 = true;
            }
            if (integer == 5) {
                hasFactor5 = true;
            }
            if (integer == 7) {
                hasFactor7 = true;
            }
        }
        if (hasFactor3 && hasFactor5 && hasFactor7) {
            System.out.println("PlingPlangPlong");
        } else if (hasFactor3 && hasFactor5) {
            System.out.println("PlingPlang");
        } else if (hasFactor3 && hasFactor7) {
            System.out.println("PlingPlong");
        } else if (hasFactor5 && hasFactor7) {
            System.out.println("PlangPlong");
        } else if (hasFactor3) {
            System.out.println("Pling");
        } else if (hasFactor5) {
            System.out.println("Plang");
        } else if (hasFactor7) {
            System.out.println("Plong");
        } else {
            System.out.println(num);
        }
    }


    //String result = "";
    //
    //        if (num % 3 == 0) {
    //            result += "Pling";
    //        }
    //        if (num % 5 == 0) {
    //            result += "Plang";
    //        }
    //        if (num % 7 == 0) {
    //            result += "Plong";
    //        }
    //
    //        if (result.isEmpty()) {
    //            System.out.println(num);
    //        } else {
    //            System.out.println(result);
    //        }
    //    }
}