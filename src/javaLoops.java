public class javaLoops {
    public static void main(String[] args) {
        //There are 3 types of loops in java
        //1. while loop 2. for loop 3. do-while loop
        //  while loop
        //  syntax--
        //  initialize;
        //  while(condition){
        //      incre/decre;
        //      .......code......
        //  }
        int n = 0;
        System.out.println("while loop......");
        while(n<=5){
            System.out.print(n + " ");
            n++;
        }
        System.out.println(" ");
        //  for loop
        //  syntax--
        //  for(initialize; condition; incre/decre){
        //      .......code......
        //  }
        System.out.println("for loop......");
        for(n = 0; n<=5; n++){
            System.out.print(n + " ");
        }
        System.out.println(" ");
        // do-while loop
        // syntax--
        // do{
        //     .......code......
        //      incre/decre;
        // }while();
        n = 0;
        System.out.println("do-while loop......");
        do{
            System.out.print(n + " ");
            n++;
        }while(n<=5);
    }
}
