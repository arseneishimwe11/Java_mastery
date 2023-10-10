package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_37 {

    public static int checker = 0;
    public static void main(String[] args) {
        ArrayList<Integer> num_list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to in array?: ");
        int limit = scanner.nextInt();

        System.out.println("Enter them: ");
        for (int i = 0; i < limit; i++) {
            int num = scanner.nextInt();
            num_list.add(num);
        }
        System.out.println(num_list);
        if(num_list.size() % 2 == 0){
            System.out.println("0(No middle element!)");
        }else{
            for (Integer elt : num_list){
                if(num_list.get(num_list.size()/2 + 1) < elt){
                    checker = 0;
                }else{
                    checker = 1;
                }
            }
            if (checker == 0){
                System.out.println("1 (The middle element is strictly less than all other elements)");
            }else{
                System.out.println("0 (the middle element 3 is not strictly less than all other elements)");
            }
        }
    }
}
