import java.util.Scanner;

public class method_distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Distance from (x1, y1) to (x2, y2).");
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.println("Distance from ("+x1+", y1) to (x2, y2).");
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.println("Distance from ("+x1+", "+y1+") to (x2, y2).");
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.println("Distance from ("+x1+", "+y1+") to ("+x2+", y2).");
        System.out.print("y2: ");
        double y2 = input.nextDouble();

        System.out.println("Distance from ("+x1+", "+y1+") to ("+x2+", "+y2+").");
        System.out.printf("Distance: %.2f",distance(x1, y1, x2, y2));
    }

    public static double distance(double x1,double y1,double x2, double y2){
        double dis = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        return dis;
    }
}
