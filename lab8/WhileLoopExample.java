public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {

            System.out.print(i);
            System.out.print(" ");
            i++;

            if (i % 10 == 0) {
                System.out.println(i);
            }

        }

    }
}