import java.util.Scanner;

public class javaLoopQues1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number: ");
        int num = sc.nextInt();
        int sum = 0;


        while(num != 0){
            sum = sum + num;
            num = sc.nextInt();
        }
        System.out.println(sum);
    }
}
