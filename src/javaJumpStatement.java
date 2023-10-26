public class javaJumpStatement {
    public static void main(String[] args) {

        //Break statement
        //syntax:
        //loop{
        //  decisionStatement(condition) {break;}
        //}
        System.out.println("Break Statement......");
        for(int num = 1; num <= 10; num++){
            if(num == 7) break;
            System.out.print(num + " ");
        }
        System.out.println(" ");
        //Continue statement
        //syntax:
        //loop{
        //  decisionStatement(condition) {continue;}
        //}
        System.out.println("Continue Statement......");
        for(int num_2 = 1; num_2 <= 10; num_2++){
            if(num_2 == 7) continue;
            System.out.print(num_2 + " ");

        }

    }
}
