import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Insert number // 1 for single / 2 for married jointly or qualitying widow(er) / 3 for married sepaeately / 4 for head of household // ");
        int status = input.nextInt();

        System.out.print("Insert your income: ");
        Double income = input.nextDouble();

        double tax =0;

        // single
        if(status==1) {
            if(income <= 8350)
                tax = income*0.10;
            else if (income <= 33950)
                tax = 8350*0.10 + (income*0.15);
            else if (income <= 82250)
                tax = 8350*0.10 + (33950*0.15) + (income*0.25);
            else if (income <= 171550)
                tax = 8350*0.10 + (33950*0.15) + (82250*0.25) + (income*0.28);
            else if (income <= 372950)
                tax = 8350*0.10 + (33950*0.15) + (82250*0.25) + (171550*0.28) + (income*0.33);
            else
                tax = 8350*0.10 + (33950*0.15) + (82250*0.25) + (171550*0.28) + (372950*0.33) + (income*0.35);
        }

        // married jointly or qualitying widow(er)
        if(status==2) {
            if(income <= 16700)
                tax = income*0.10;
            else if (income <= 67900)
                tax = 16700*0.10 + (income*0.15);
            else if (income <= 137050)
                tax = 16700*0.10 + (67900*0.15) + (income*0.25);
            else if (income <= 208850)
                tax = 16700*0.10 + (67900*0.15) + (137050*0.25) + (income*0.28);
            else if (income <= 372950)
                tax = 16700*0.10 + (67900*0.15) + (137050*0.25) + (208850*0.28) + (income*0.33);
            else
                tax = 16700*0.10 + (67900*0.15) + (137050*0.25) + (208850*0.28) + (372950*0.33) + (income*0.35);
        }

        // married filing separately
        if(status==3) {
            if(income <= 8350)
                tax = income*0.10;
            else if (income <=33950)
                tax = 8350*0.10 + (income*0.15);
            else if (income <= 68525)
                tax = 8350*0.10 + (33950*0.15) + (income*0.25);
            else if (income <= 104425)
                tax = 8350*0.10 + (33950*0.15) + (68525*0.25) + (income*0.28);
            else if (income <= 186475)
                tax = 8350*0.10 + (33950*0.15) + (68525*0.25) + (104425*0.28) + (income*0.33);
            else
                tax = 8350*0.10 + (33950*0.15) + (68525*0.25) + (104425*0.28) + (186475*0.33) + (income*0.35);
        }
        
        // head of house household
        if(status==4) {
            if(income <= 11950)
                tax = income*0.10;
            else if (income <= 45500)
                tax = 11950*0.10 + (income*0.15);
            else if (income <= 117450)
                tax = 11950*0.10 + (45500*0.15) + (income*0.25);
            else if (income <= 190200)
                tax = 11950*0.10 + (45500*0.15) + (117450*0.25) + (income*0.28);
            else if (income <= 372950)
                tax = 11950*0.10 + (45500*0.15) + (117450*0.25) + (190200*0.28) + (income*0.33);
            else
                tax = 11950*0.10 + (45500*0.15) + (117450*0.25) + (190200*0.28) + (372950*0.33) + (income*0.35);
        }

        System.out.println("Tax is you must pay : " + (tax) + " $");
    }
}