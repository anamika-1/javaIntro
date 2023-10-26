import java.util.Scanner;

public class javaForQues1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number: ");
        int n = sc.nextInt();

        System.out.print("Surprise: ");
        for(int num = 1; num <= n; num++){
            System.out.print(num + " ");
        }
    }
}
