public class Main {

    public static void main(String[] args) {
        AverageCalculator averageCalculator = new AverageCalculator();
        averageCalculator.calculateAverage(10);
       //int[] myIntArray = {1, 2, 3,  4, 5, 6, 7, 8, 9, 10};
//        int[] myIntArray = new int[10];
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i*10;
//        }

//        printArray(myIntArray);

    }

    private static void printArray (int[] array) {
        for (int i =0 ; i < array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
