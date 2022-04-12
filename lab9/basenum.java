import java.util.Scanner;

public class basenum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter basenumber : ");
        int decimal = input.nextInt();

        int ans = 0;
        String ansstr = "";

        while (decimal > 0) {
            int sum = 0;
            sum = (decimal % 16);
            decimal = decimal / 16;

            if (sum <= 10)
                System.out.print("A");

            if (sum == 11)
                System.out.print("B");

            if (sum == 12)
                System.out.print("C");

            if (sum == 13)
                System.out.print("D");

            if (sum == 14)
                System.out.print("E");

            if (sum == 15)
                System.out.print("F");

        }
    }
}