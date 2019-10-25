public class Main {

    public static void main(String[] args) {

        double pounds = 160;
        double kilograms = (pounds * .45359237);
        System.out.println("Converted Kilograms" + kilograms);

        boolean isFinished = false;
        if (!isFinished) {
            System.out.println("This is not finished");
        }

        boolean wasCar = isFinished ? true : false;
        if (!wasCar) {
            System.out.println("success");

        }

        //challenge
        double myVar = 20.00;
        double myVar2 = 80.00;
        double myTotalVar = myVar + myVar2 * 100.00;
        System.out.println(myTotalVar);
        double remainder = myTotalVar % 40.00;
        System.out.println(remainder);
        boolean isRemainder;
        //boolean RemainderCheck = (remainder == 0)? true : false;

        if (remainder == 0){
            isRemainder = false;
        }else{
            isRemainder = true;
        }

        if(isRemainder){
            System.out.println("Got some remainder");
        }
    }
}
