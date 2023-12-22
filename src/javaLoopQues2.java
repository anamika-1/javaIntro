import java.util.Scanner;

public class javaLoopQues2 {
    //count the number of digits for a given number n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number: ");
        int n = sc.nextInt();
        int num = n;
        int count = 0;
        for(;n > 0;){
          n =  n / 10;
          count++;
        }
        System.out.println("Number of digits in " + num + " = " + count);
    }

}
