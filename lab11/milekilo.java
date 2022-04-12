public class milekilo {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        System.out.println("Miles       Kilometers     |    Kilometers       Miles");
        System.out.println("------------------------------------------------------");
        int j = 20;
        for(int i = 1; i <= 10; i++){
            System.out.printf("%.2f",Double.valueOf(i));
            if(i < 7) {
                System.out.print("        ");
            } else if(i == 10) {
                System.out.print("      ");
            } else {
                System.out.print("       ");
            }
            System.out.printf("%.3f",mileTokilometer(i));
            System.out.print("           |   ");
            System.out.printf("%.2f",Double.valueOf(j));
            System.out.print("            ");
            System.out.printf("%.2f",kilometerTomile(j));
            System.out.println("");
            j += 5;
        }
        System.out.println("----------------------------------------------------");
    }

    public static double mileTokilometer(double mile) {
        return mile*1.609;
    }

    public static double kilometerTomile(double kilometer){
        return kilometer/1.609;
    }
}
