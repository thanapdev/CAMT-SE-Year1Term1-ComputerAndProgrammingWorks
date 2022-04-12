import java.util.Scanner;
public class ComputerTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input name");
        String name = input.next();
        System.out.println("input hourwork");
        double hourwork = input.nextDouble();
        System.out.println("input payrate");
        double payrate = input.nextDouble();
        
        System.out.println("Employee's name : " + name);
        System.out.println("Hours work : " + hourwork);
        System.out.println("Pay rate : " + payrate + "$");
        System.out.println("Gross pay : " + (payrate * hourwork) + "$" );

        System.out.println("Deductions : ");

        double fedewithhold = ((payrate * hourwork) *20) /100;
        System.out.println("Federak withholding : " + fedewithhold);

        double statewithhold = ((payrate * hourwork) *9) /100;
        System.out.println("State withholding : " + statewithhold);
        System.out.println("Total Deduction : " + (statewithhold + fedewithhold));

        System.out.println("Net pay for "+ name + ": " + ((payrate * hourwork) - (statewithhold + fedewithhold)));
    }    
}
