public class Main {

    public static void main(String[] args) {

        System.out.println(isOdd(0));
        System.out.println(sumOdd(100, 1000));

        /* sum challenge */
//        int count = 0;
//        int sum = 0;
//        for (int i = 1; i <= 1000 ; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)){
//                System.out.println("number found = " + i);
//                sum += i;
//                System.out.println("sum is on "+ sum);
//                count ++;
//                if(count == 5){
//                    break;
//                }
//            }
//        }



            //interest challenge
//        for (int i = 8; i >= 2; i--){
//            System.out.println("10000 at " + i +"% interest = " + String.format("%.2f",calculatedInterested(10000.0, i) )) ;
//        }

            //prime finder challenge
//        int count = 0;
//        for (int i = 4000; i < 9000; i++) {
//            if(isPrime(i)){
//                System.out.println(i);
//                count++;
//                if(count == 10 ){
//                    System.out.println("Exiting for loop");
//                    break;
//                }
//            }
//        }

    }

    public static double calculatedInterested(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n){

        if (n == 0){
            return false;
        }

        for (int i = 2; i <= n/2 ; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd (int number){
        if (number > 0){
            if (number % 2 == 0){
                return false;
            }
        }else{
            System.out.println("Invalid Value");
            return false;
        }
        return true;
    }

    public static int sumOdd (int start, int end){
        int sum = 0;
        if ((start > 0 && end > 0) && (end <= start)) {
            for (int number = start; number <= end; number ++){
                if(isOdd(number)){
                    sum += number;
                }
            }
            return sum;
        }
        //System.out.println("Invalid parameters");
        return -1;
    }

}
