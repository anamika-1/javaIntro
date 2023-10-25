import java.util.Scanner;

//print sum of n natural numbers using users input
public class javaWhileQues2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give a number: ");
        int n = sc.nextInt();

        System.out.print("Sum of all numbers till n: ");
        int sum = 0;
        int num = 1;
        while(num <= n){
            sum = sum + num;
            num++;
        }
        System.out.print(sum);
    }
}
