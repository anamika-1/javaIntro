import java.util.Scanner;

public class javaInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println(name);

        System.out.println("Enter number: ");
        int num = sc.nextInt();// for integer input
        System.out.println(num);


    }
}
