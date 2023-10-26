public class javaBreakQue1 {
    public static void main(String[] args) {
        // Q - print the first multiple of 5 which is also multiple of 7
        for (int num = 1; true; num++) {
            if (num % 5 == 0 && num % 7 == 0) {
                System.out.println("Found no YaYYYY: " + num);
                break;
            }

        }
    }
}
