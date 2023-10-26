import java.util.Scanner;
// Print natural number in reverse from n
public class javaForQues3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number: ");
        int n = sc.nextInt();

        System.out.print("Reverse series from n to 1: ");
        for(int num = n; num >=1; num--){
            System.out.print(num + " ");
        }

    }
}
