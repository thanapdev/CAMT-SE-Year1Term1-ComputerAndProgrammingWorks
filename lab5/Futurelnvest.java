import java.util.Scanner;
public class Futurelnvest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input amount");
        double amount = input.nextDouble();
        System.out.println("input interest");
        double interest = input.nextDouble();
        System.out.println("input year");
        double year = input.nextDouble();

        double futureinvest = 0;

        futureinvest = (Math.pow((1 + ((interest)/100)),year) * 1000);
        

        System.out.println(futureinvest);
}
}