import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("How long do you want your array to be?");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        Reverse(array);

//        System.out.println("The smallest element in this array is "+ findMin(array));

	// write your code here
    }

    public static int[] readIntegers (int count) {
        int[] intArray = new int[count];
        System.out.println("Insert the " +count+" numbers that you would like to be added to the array");
        for (int i = 0; i < intArray.length ; i++) {
            int number =  scanner.nextInt();
            scanner.nextLine();
            intArray[i] = number;
        }
        for (int i = 0; i < intArray.length ; i++) {
            System.out.print("|" + intArray[i]);
        }
        System.out.println("|");
        return intArray;
    }

    public static int findMin (int[] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length - 1 ; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.print("|" + array[i]);
        }
        System.out.println("|");
        return array[0];
    }

    //additional coding challenge
    public static int[] Reverse (int[] array){
        int j = array.length - 1;
        for (int i = 0; i < array.length/2 ; i++) {
            int tempEnd = array[i];
            array[i] = array[j];
            array[j] = tempEnd;
            j--;
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.print("|" + array[i]);
        }
        return array;
    }
}
