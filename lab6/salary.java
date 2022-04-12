import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hours worked: ");
        int hours = input.nextInt();

        if(hours <= 40){
            System.out.println("receives: $"+hours*8);
        } else {
            System.out.println("receives: $"+(320+(12*(hours-40))));
        }
    }
}
