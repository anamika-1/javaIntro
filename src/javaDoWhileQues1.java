import java.util.Scanner;

public class javaDoWhileQues1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number: ");
        int n = sc.nextInt();
        System.out.print("Natural number till n: ");
        int num = 1;
        do{
            System.out.print(num + " ");
            num++;
        }while(num <= n);



    }
}
