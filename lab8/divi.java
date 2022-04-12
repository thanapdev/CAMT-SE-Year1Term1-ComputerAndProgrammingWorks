import java.util.Scanner;
public class divi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input some number? : ");
        int num = input.nextInt();
        int i = 1;
        while(i<num){
        if(i % 5 == 0 || i % 7 == 0 ){
            if(i % 35 != 0){
                System.out.print(i);
                System.out.print(" ");
                if (i % 30 == 0) {
                    System.out.println();
                }
            }
         }
         i++;
        }
    }
}
