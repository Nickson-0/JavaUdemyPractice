public class Main {

    public static void main(String[] args) {
        // write your code here
//        int answer = sumDigits(10000000);
//        System.out.println(answer);
//        System.out.println(isPalindrome(10));
//        System.out.println(hasSharedDigits(105000,2225222));
//        printFactors(245245242);
//        numberToWords(123);
        numberToWords(1006670);

    }

    private static int sumDigits(int number) {
        if (number >= 10) {
            int sum = 0;
            boolean isFinished = false;

            while (!isFinished) {
                sum += number % 10;
                number = number / 10;
                if (number <= 0) {
                    isFinished = true;
                }
            }
            return sum;
        }
        return -1;
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int numberCopy = number;
        boolean isFinished = false;

        while (!isFinished) {
            reverse += numberCopy % 10;
            numberCopy = numberCopy / 10;
            if (numberCopy != 0) {
                reverse *= 10;
            } else {
                isFinished = true;
            }
        }
        return (reverse == number);
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int evenNumberCheck;
        int sum = 0;

        while (number > 0) {
            evenNumberCheck = number % 10;
            number = number / 10;
            if (!(evenNumberCheck % 2 == 0)) {
                continue;
            } else {
                sum += evenNumberCheck;
            }
        }
        return sum;
    }

    public static boolean hasSharedDigits(int number1, int number2) {
        if ((number1 >= 10) && (number1 <= 99)) {
            if ((number2 >= 10) && (number2 <= 99)) {
                int originalNumber2 = number2;
                while (number1 > 0) {
                    int lastDigits = number1 % 10;
                    number1 /= 10;
                    number2 = originalNumber2;
                    while (number2 > 0) {
                        int lastDigitOfNumber2 = number2 % 10;
                        number2 /= 10;
                        if (lastDigits == lastDigitOfNumber2) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {

        if (isValid(number1) && isValid(number2) && isValid(number3)) {
            return (number1 % 10 == number2 % 10 || number2 % 10 == number3 % 10 || number1 % 10 == number3 % 10);
        }
        return false;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static void printFactors(int number) {
        if (number >= 1) {
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.print(number);
            return;
        }
        System.out.println("Invalid Value");
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int divisor = 1;
        int sum = 0;
        while (divisor < number) {
            if (number % divisor == 0) {
                sum += divisor;
            }
            divisor++;
        }
        return (sum == number);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int numberCount = 0;
        int reverse = reverse(number);
        while (reverse > 0) {
            int lastDigit = reverse % 10;
            reverse /= 10;
            numberCount++;
            switch (lastDigit) {
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("Zero ");
            }

        }
        if (!(numberCount == getDigitCount(number))) {
            int numberDifference = getDigitCount(number) - numberCount;
            for (int i = 0; i < numberDifference; i++) {
                System.out.print("Zero ");
            }
        }

    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber += number % 10;
            number /= 10;
            if (number != 0) {
                reversedNumber *= 10;
            }
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        int digitCount = 0;
        if (number < 0){
            return -1;
        }
        if (number >= 10) {
            while (number != 0) {
                number /= 10;
                digitCount++;
            }
            return digitCount;
        }
        return 1;
    }
}
