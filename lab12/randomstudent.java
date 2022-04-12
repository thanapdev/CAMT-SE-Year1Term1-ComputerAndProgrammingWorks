public class randomstudent {
    public static void main(String[] args) {
        int[] studentscore = new int[100];

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;

        int max = 101;
        int min = 1;
        int range = max - min + 1;

        for (int i = 0; i < studentscore.length; i++) {
            studentscore[i] = (int) ((Math.random() * (max - min)) + min);

            if (studentscore[i] > 80) {
                a += 1;
            } else if (studentscore[i] > 70) {
                b += 1;
            } else if (studentscore[i] > 60) {
                c += 1;
            } else if (studentscore[i] > 50) {
                d += 1;
            } else {
                f += 1;
            }
        }

        System.out.println("Student got A >> " + a);
        System.out.println("Student got B >> " + b);
        System.out.println("Student got C >> " + c);
        System.out.println("Student got D >> " + d);
        System.out.println("Student got F >> " + f);
        System.out.println("Total Student>>"+studentscore.length);
    }
}
