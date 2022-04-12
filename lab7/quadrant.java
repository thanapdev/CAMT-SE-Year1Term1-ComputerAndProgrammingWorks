import java.util.Scanner;
public class quadrant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int angle = input.nextInt();

            if (angle > 0 && angle < 90) {

                System.out.println("Quarant I");
            }

            else if (angle > 90 && angle < 180) {

                System.out.println("Quarant II");
            }

            else if (angle > 180 && angle < 270) {

                System.out.println("Quarant III");
            }

            else if (angle > 270 && angle < 360) {

                System.out.println("Quarant IV");
            }

            else {
                System.out.println("Your angle are on the axis");
            }

            



    }
}