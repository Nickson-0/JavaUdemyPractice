public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double userNum1, double userNum2){
        int num1 = (int) (userNum1 * 1000);
        int num2 = (int) (userNum2 * 1000);
        if(num1 == num2){
            return true;
        }
        return false;
    }
}
