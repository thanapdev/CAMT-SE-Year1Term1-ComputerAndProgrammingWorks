import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insert F for converting Celsius into Fahrenheit or insert C for converting Fahrenheit into Celsius: ");
        String tempMode = input.next();

        System.out.print("Insert temperature to convert: ");
        Double tempNum = input.nextDouble();

        if(tempMode.equals("c") || tempMode.equals("C")){
            System.out.format("F -> C: %.2f", ((tempNum-32)*5/9));
        } else if(tempMode.equals("f") || tempMode.equals("F")){
            System.out.format("C -> F: %.2f", ((tempNum*9/5)+32));
        } else {
            System.out.println(tempMode);
            System.out.print("Error: Please insert C or F.");
        }
    }
}