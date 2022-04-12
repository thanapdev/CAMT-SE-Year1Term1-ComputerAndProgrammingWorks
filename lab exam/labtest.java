import java.util.Scanner;

public class labtest {

    //-----------------------------
    // 642115022 thanapong yamkamol
    //-----------------------------

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Province : ");
        String province = input.nextLine();

        System.out.print("Mass : ");
        String mass = input.nextLine();

        System.out.print("Do you work in hospital ? : ");
        String hospital = input.nextLine();

        System.out.print("Age : ");
        int age = input.nextInt();

        System.out.println("your rate : " + calrate(province, mass, hospital, age));

        double rate = calrate(province, mass, hospital, age);

        System.out.println("you need to get the vaccince in " + sumday(rate) + " day");
    }

    public static Double calrate(String province , String mass, String hospital , int age) {
        double rate = 1;

        if (province.equals("Chaing mai")) {
            rate *= 0.3;
        }else if (province.equals("Phuket")) {
            rate *= 0.6;
        }else if (province.equals("Bangkok")) {
            rate *= 1.0;
            
        }

        if (mass.equals("normal")) {
            rate *= 0.3;
        }else if (mass.equals("fat")) {
            rate *= 0.6;
        }else if (mass.equals("very fat")) {
            rate *= 1.0;
        }

        if (hospital.equals("no")) {
            rate *= 0.3;
        }else if (hospital.equals("-")) {
            rate *= 0.6;
        }else if (hospital.equals("yes")) {
            rate *= 1.0;
        }

        if (age >= 12 && age <= 30) {
            rate *= 0.3;
        }else if (age >= 31 && age <= 50) {
            rate *= 0.6;
        }else if (age >50) {
            rate *= 1.0;
        }
        return rate;
    }

    public static int sumday(double rate) {
        int day = 0;

       if (rate >= 0.61 && rate <= 1.00) {
           day = 3;
       }
        if (rate >= 0.21 && rate <= 0.6) {
           day = 7;
       }
       if (rate >= 0.1 && rate <= 0.2) {
        day = 14;
        }
        if (rate >= 0 && rate <= 0.9) {
        day = 30;
        }
        return day;
        
    }
    
    
}