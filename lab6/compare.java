import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insert first number: ");
        int num1 = input.nextInt();

        System.out.print("Instert second number: ");
        int num2 = input.nextInt();

        if(num1 > num2){
            System.out.print("The first number is greater than the second.");
        } else if(num1 < num2){
            System.out.print("The first number is no greater than the second.");
        } else {
            System.out.print("These two numbers are equal.");
        }
    }
}
