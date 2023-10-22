public class javaConditions {
    public static void main(String[] args) {
        //Let's look at conditional statements in java
        int a = 10;
        System.out.println("if statement...........");
        //if statement
        //syntax: if(condition to be checked){
        //          ............code......
        //        }
        if(a==10){
            System.out.println("A is 10");
        }
        System.out.println(" ");
        //if else statement
        System.out.println("if else statement...........");
        //syntax: if(condition to be checked){
        //                  ............code......
        //        }
        //        else{
        //                  ............code......
        //        }
        if(a<10){
            System.out.println("A is less than 10");
        }
        else{
            System.out.println("A is 10");
        }
        System.out.println(" ");
        //if else ladder statement
        System.out.println("if else ladder statement...........");
        //syntax: if(condition to be checked){
        //                  ............code......
        //                  if(condition to be checked){
        //                      ............code......
        //                  }
        //                  else{
        //                      ............code......
        //                  }
        //        }
        //        else{
        //                  ............code......
        //        }
        if(a > 5){
            System.out.println("A is greater than 5");
            if(a == 10){
                System.out.println("A is equal to 10");
            }
            else{
                System.out.println("A is not equal to 10");
            }
        }
        else{
            System.out.println("None...");
        }
        System.out.println(" ");
        //else if statement
        System.out.println("else if statement...........");
        //syntax: if(condition to be checked){
        //                  ............code......
        //        }
        //        else if{
        //                  ............code......
        //        }
        //        else{
        //                  ............code......
        //        }
        if(a < 5){
            System.out.println("A is less than or equal to 5");
        }
        else if (a < 10) {
            System.out.println("A is less than 10");
        }
        else {
            System.out.println("A is equal to 10");
        }
        System.out.println(" ");
        //else if ladder statement
        System.out.println("else if ladder statement...........");
        //syntax: if(condition to be checked){
        //                  ............code......
        //        }
        //        else if{
        //                  ............code......
        //        }
        //        else if{
        //                  ............code......
        //        }
        //        else if{
        //                  ............code......
        //        }
        //        else{
        //                  ............code......
        //        }
        if(a < 5){
            System.out.println("A is less than or equal to 5");
        }
        else if (a < 7) {
            System.out.println("A is less than or equal to 7");
        }
        else if (a < 10) {
            System.out.println("A is less than 10");
        }
        else {
            System.out.println("A is equal to 10");
        }
        System.out.println(" ");
        //switch
        System.out.println("switch statement...........");
        // switch(expression){
        //      case value 1:
        //          .......code.......
        //          break;
        //      case value 2:
        //          .......code.......
        //          break;
        //      case value 3:
        //          .......code.......
        //          break;
        //      default:
        //          .......code.......
        //  }
        switch (a){
            case 5:
                System.out.println("A is 5");
                break;
            case 7:
                System.out.println("A is 7");
                break;
            case 10:
                System.out.println("A is 10");
                break;
            default:
                System.out.println("None...");
        }
    }
}
