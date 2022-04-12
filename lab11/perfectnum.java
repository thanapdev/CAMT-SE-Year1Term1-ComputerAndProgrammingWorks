import java.util.Scanner;

public class perfectnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input number : ");
        int num = input.nextInt();
        

        if (isPerfect(num) == true) {
            System.out.println("This number is perfect number");
        } else {
            System.out.println("This number is not perfect number");
        }

    }

    public static Boolean isPerfect(int Number) {

        int Sum = 0;

        for (int i = 1; i < Number; i++) {
            if (Number % i == 0) {
                Sum = Sum + i;
            }
        }

        if (Sum == Number) {
            return true;
        } else {
            return false;
        }

    }

}
