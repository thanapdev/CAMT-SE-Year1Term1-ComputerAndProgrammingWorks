import java.util.Scanner;
//---------lab 3
//---------(Thanapopng Yamakamol 642115022)
// This is program for calculate the money exchange
public class ConvertMoney {
    public static void main(String[] args) {
        double bath;
        double usdollar;
    
        Scanner input = new Scanner(System.in);
        System.out.print("input your money(Dollar): ");
        usdollar = input.nextDouble();
        bath = usdollar*31.8245;
        System.out.println("exchange money(Bath): "+ bath );
        
    }
}
