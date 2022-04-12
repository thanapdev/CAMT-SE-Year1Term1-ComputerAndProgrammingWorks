import java.util.Scanner;
public class celtofarmethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double answer;

        while (true) {

            System.out.print("Input key(1 for C to F | 2 for F to C) : ");
            int key = input.nextInt();

            if (key == 1) {

                System.out.print("Please input temp :");
                double num = input.nextDouble();

                answer = CeltoFar(num);

                System.out.println("Convert Cel to Far = " + answer);

            }

            if (key == 2) {

                System.out.print("Please input temp :");
                double num = input.nextDouble();

                answer = FartoCel(num);

                System.out.println("Convert Far to Cel = " + answer);
            }

            else if(key == 0){
                System.out.println("Thankyou");
                break;
            }

        }

    }

    private static double CeltoFar(double cel) {

        double far = ((9 * cel) / 5) + 32;
        return far;

    }

    private static double FartoCel(double far) {

        double cel = ((far - 32) * 5) / 9;
        return cel;
    }
}
