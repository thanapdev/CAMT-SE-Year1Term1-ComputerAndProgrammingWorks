public class pyramid {
    public static void main(String[] args) {
        for (int i = 7; i >= 0; i--){
            for (int j = i; j >= 0; j--){
                System.out.print("     ");
            }
            for (int k = 0; k <= 7-i; k++){
                System.out.printf(" %4d",(int)Math.pow(2,k));
            }
            for (int x = 6-i; x >= 0; x--){
                System.out.printf(" %4d",(int)Math.pow(2,x));
            }
            System.out.println("");
        }
    }    
}