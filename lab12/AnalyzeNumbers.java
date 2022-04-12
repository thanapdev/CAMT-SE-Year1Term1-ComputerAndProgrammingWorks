public class AnalyzeNumbers {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        double average = sum / n;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        System.out.println("Average is " + average);
        System.out.println("The number of element above the average is " + count);

        findMax(numbers);
        findMin(numbers);
        printArray(numbers);
    }

    public static void printArray(double[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void findMax(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Max is " + max);

    }

    public static void findMin(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Min is " + min);

    }

}
