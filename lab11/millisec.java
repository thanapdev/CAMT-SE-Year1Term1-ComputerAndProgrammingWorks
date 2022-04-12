import java.util.Scanner;

public class millisec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number : ");
        convertMillis(input.nextInt());

    }

    public static String convertMillis(long millis) {

        long hour, minute, second = 0;

        second = millis / 1000;
        millis = millis % 1000;

        minute = second / 60;
        second = second % 60;

        hour = minute / 60;
        minute = minute % 60;

        System.out.println(hour + ":" + minute + ":" + second);
        String result = hour + ":" + minute + ":" + second;

        return "Hello";

    }

}
