import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = getIntegers(8);
        printArray(array);
        sortArray(array);
        printArray(array);

    }

    public static int[] getIntegers(int arraySize){
        System.out.println("insert array values");
        int[] array = new int [arraySize];
        for (int i = 0; i < array.length; i++) {
            int arrayElement = scanner.nextInt();
            array[i] = arrayElement;
        }
        return array;
    }

    public static void printArray (int[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.print("| " + array[i] + " ");
        }
        System.out.println("|");
    }

    public static int[] sortArray (int[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.println("loop " + i);
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] < array[j + 1]) {
                   int temp = array[j + 1];
                   array[j + 1] = array[j];
                   array[j] = temp;
                   printArray(array);
                }
            }
        }
        return  array;
    }
}
