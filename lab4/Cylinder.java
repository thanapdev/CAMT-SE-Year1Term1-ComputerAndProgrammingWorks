import java.util.Scanner;
    //----------Lab 3
    //----------(Thanapong Yamkamol)
    //----------(Student ID 642115022)
public class Cylinder {
    public static void main(String[] args) {
        double length;
        double radius;
        double area;
        double volume;
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter radius:");
        radius = input.nextDouble();
    
        System.out.print("Enter length:");
        length = input.nextDouble();
    
        area = radius * radius * 3.1428;
        volume = area * length;
    
        System.out.println("The area is "+area);
        System.out.println("The volume is "+volume);
    }
    
}
