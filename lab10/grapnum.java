import java.util.Scanner;

public class grapnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        String num = input.next();
        for (int i = 0; i < num.length(); i++) {
            printNum(num.substring(i, i+1));
            System.out.println("");
        }
    }

    public static void printNum(String thingsToPrint) {
        if(thingsToPrint.equals("1")) {
            System.out.println("1111");
            System.out.println("  11");
            System.out.println("  11");
            System.out.println("  11");
            System.out.println("  11");

        } else if(thingsToPrint.equals("2")) {
            System.out.println("222222");
            System.out.println("   22");
            System.out.println("  22");
            System.out.println(" 22");
            System.out.println("222222");

        } else if(thingsToPrint.equals("3")) {
            System.out.println("333333");
            System.out.println("    33");
            System.out.println(" 33333");
            System.out.println("    33");
            System.out.println("333333");

        } else if(thingsToPrint.equals("4")) {
            System.out.println("44   44");
            System.out.println("44   44");
            System.out.println("4444444");
            System.out.println("     44");
            System.out.println("     44");

        } else if(thingsToPrint.equals("5")) {
            System.out.println("5555555");
            System.out.println("55");
            System.out.println("5555555");
            System.out.println("     55");
            System.out.println("5555555");

        } else if(thingsToPrint.equals("6")) {
            System.out.println("6666666");
            System.out.println("66");
            System.out.println("6666666");
            System.out.println("66   66");
            System.out.println("6666666");

        } else if(thingsToPrint.equals("7")) {
            System.out.println("7777777");
            System.out.println("    77");
            System.out.println("   77");
            System.out.println("  77");
            System.out.println(" 77");

        } else if(thingsToPrint.equals("8")) {
            System.out.println("88888888");
            System.out.println("88    88");
            System.out.println("88888888");
            System.out.println("88    88");
            System.out.println("88888888");

        } else if(thingsToPrint.equals("9")) {
            System.out.println("9999999");
            System.out.println("99   99");
            System.out.println("9999999");
            System.out.println("     99");
            System.out.println("9999999");
            
        } else if(thingsToPrint.equals("0")) {
            System.out.println("0000000");
            System.out.println("00   00");
            System.out.println("00   00");
            System.out.println("00   00");
            System.out.println("0000000");
        }
    }
}