package Exercises;

import java.util.Scanner;

//Christmas Tree
public class Question_5 {
    public static int tree_length;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the tree: ");
        tree_length = scanner.nextInt();
        for(int i = 0 ; i <= tree_length ; i++) {
            for (int j = 0; j <= tree_length - i; j++) {
                System.out.print(" ");
            }
            //printing asterisks
            for (int k = 0; k < i*2 + 1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if(tree_length % 2 != 0){
            tree_length += 1;
        }
        for (int i = 1; i < 2; i++) {
            for (int j = 1; j < tree_length/2 + 4; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
    }
}
