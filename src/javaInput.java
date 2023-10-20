import java.util.Scanner;

public class javaInput {
    public static void main(String[] args) {
        //scanner class to take user input
        Scanner sc = new Scanner(System.in);
        //non primitive datatype - string
        System.out.println("enter any string");
        String st = sc.next();//for string input
        System.out.println(st);


        //primitive data types
        //char
        System.out.println("enter any char");
        char ch = sc.next().charAt(0);
        System.out.println(ch);

        //byte
        System.out.println("enter any byte");
        byte b = sc.nextByte();
        System.out.println(b);

        //short
        System.out.println("enter any short");
        short s = sc.nextShort();
        System.out.println(s);

        //int
        System.out.println("enter any int");
        int i = sc.nextInt();// for integer input
        System.out.println(i);

        //long
        System.out.println("enter any long");
        long l = sc.nextLong();
        System.out.println(l);


        //float
        System.out.println("enter any float");
        float f = sc.nextFloat();
        System.out.println(f);

        //double
        System.out.println("enter any double");
        double d = sc.nextDouble();
        System.out.println(d);

        //boolean
        System.out.println("enter any boolean");
        boolean bool = sc.nextBoolean();
        System.out.println(bool);
    }
}
