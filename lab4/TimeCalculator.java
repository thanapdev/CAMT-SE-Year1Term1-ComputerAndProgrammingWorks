import java.util.Scanner;
//----------Lab 3
//----------(Thanapong Yamkamol)
//----------(Student ID 642115022)
//This program for calculate time
public class TimeCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter second :");
        Scanner mamamia = new Scanner(System.in);
        int second = mamamia.nextInt();
        int min = 0;
        int hour = 0;
        int day = 0;
        while (second >= 60) {
            if (second >= 60) {
                min += 1;
                second -= 60;
            }

            if (min >= 60) {
                hour += 1;
                min -= 60;
            }

            if (hour >= 24) {
                day += 1;
                hour -= 24;
            }
        }
        System.out.println(day + " day " + hour + " hour " + min + " minute " + second + " second ");
    }
}