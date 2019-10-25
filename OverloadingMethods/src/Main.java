public class Main {

    public static void main(String[] args) {
        //System.out.println(calcFeetAndInchesToCentimetres(100));
        //calcFeetAndInchesToCentimetres(0,12);
        printYearsAndDays(561600);


	// write your code here
    }

    public static double calcFeetAndInchesToCentimetres (double feet, double inches){
        if(feet >= 0 && (inches >=0 && inches <= 12)){
            double feetToInches = feet * 12;
            double centimetres = (inches * 2.54) + feetToInches * 2.54;
            System.out.println(feet +" ft and " + inches + " inches = " + centimetres + "" +
                    " centimetres." );
            return centimetres;

        }
        System.out.println("Invalid Input");
        return -1;
    }

    public static double calcFeetAndInchesToCentimetres (double inches){
        if((inches >=0 )){
            double feet = Math.floor(inches / 12);
            double newInches = (inches % 12);
            return calcFeetAndInchesToCentimetres(feet, newInches);
        }
        System.out.println("Invalid Input");
        return -1;
    }

    public static double area (double radius){
        if(radius >= 0){
            return radius * radius * Math.PI;
        }
        return -1;
    }

    public static double area (double x, double y){
        if(x < 0 || y < 0){
            return -1;
        }
        return x * y;
    }

    public static void printYearsAndDays (long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
            return;
        }
        long hours = minutes / 60;
        long days = hours/24;
        long years = days / 365;
        long daysToPrint = days % 365;
        System.out.println(minutes + " min = " + years + " y and " + daysToPrint + " d" );
    }
}
