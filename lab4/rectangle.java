import java.util.Scanner;
    //----------Lab 3
    //----------(Thanapong Yamkamol)
    //----------(Student ID 642115022)
    //This program for calculate the area of rectangle
public class rectangle {
    public static void main(String[] args) {

    double length;
    double width;
    double area;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter length:");
    length = input.nextDouble();

    System.out.print("Enter width:");
    width = input.nextDouble();

    area = length * width;

    System.out.println("The area of rectangle is "+area);
} 


}