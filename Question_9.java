package Exercises;

public class Question_9 {
    public static int n=0, sum=0;
    public static void main(String[] args) {
        while(n<100){
            if(n%2 == 0){
                sum += n;
            }
            n++;
        }
        System.out.println("The sum of all even numbers less than 100 is: " + sum);
    }
}
