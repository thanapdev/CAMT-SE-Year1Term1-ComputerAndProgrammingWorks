import java.util.Scanner;

public class testScore {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Score: ");
        int score = input.nextInt();

        //Test the score if over or equal 80
        if (score >= 80)
        System.out.println("Your are pass");

        //the score is now over or equal 80
        else
        System.out.println("Your are fail");
    }  
}
