import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1,1.5, 2));
        inputThenPrintSumAndAverage();
        // write your code here

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number " + count + ":");
            count++;
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number < minNumber) {
                    minNumber = number;
                    continue;
                }
                if (number > maxNumber) {
                    maxNumber = number;
                }
            } else {
                System.out.println("Invalid Value");
                System.out.println("Your Max Number is:\n" + maxNumber + "\nAnd your Min is: \n"
                        + minNumber);
                break;
            }
        }
        scanner.close();
    }

    public static void inputThenPrintSumAndAverage (){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average;
        int count = 0;
        while (true) {
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                sum += number;
                count ++;
            }else{
                average = Math.round((double)sum / count);
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.nextLine();
        //scanner.close();
    }



    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double area = height * width;
        double getBucketCount = (area - (areaPerBucket * extraBuckets)) / areaPerBucket;
        getBucketCount = Math.ceil(getBucketCount);
        return (int) getBucketCount;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double area = height * width;
        double getBucketCount = Math.ceil((area / areaPerBucket));
        return (int) getBucketCount;
    }

    public static int getBucketCount (double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double getBucketCount = Math.ceil((area / areaPerBucket));
        return (int) getBucketCount;
    }
}
