
import java.util.Scanner;

public class javaInputQuesSimpleInterest {
    public static void main(String[] args) {
        //Take input from user and find simple interest
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principal");
        int principal = sc.nextInt();
        System.out.println("enter rate of interest");
        double rate = sc.nextFloat();
        System.out.println("enter time");
        int time = sc.nextInt();

        double simpleInterest = principal * rate * time / 100;
        System.out.println("simple interest = " + simpleInterest);


    }
}
