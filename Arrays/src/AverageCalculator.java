import java.util.Scanner;

public class AverageCalculator {

    public AverageCalculator() {
    }

    public void calculateAverage(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme a list of numbers");
        int[] array = new int [number];
        for (int i = 0; i < array.length; i++) {
            int userNumber = scanner.nextInt();
            array[i] = userNumber;
            System.out.println("Element " + i + ", value is " + array[i]);
            //System.out.println(count);
        }
        int sum = 0;
        for (int i =0 ; i <array.length; i++){
            System.out.print("| " + array[i] + " ");
            sum += array[i];
        }
        System.out.println("|");
        double average = sum / array.length;
        System.out.println("The average is " + average);
    }

}
