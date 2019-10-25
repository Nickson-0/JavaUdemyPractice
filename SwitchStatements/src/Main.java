public class Main {

    public static void main(String[] args) {
        // write your code here

       // printDayOfTheWeek(3);

        System.out.println(getDaysInMonth(1, -2020));


//        char charValue = 'C';
//        switch (charValue) {
//            case 'A':
//                System.out.println('A');
//                break;
//            case 'B':
//                System.out.println('B');
//                break;
//            case 'C':
//                System.out.println('C');
//                break;
//            case 'D':
//                System.out.println('D');
//                break;
//            default:
//                System.out.println("wrong");
//        }
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }

    }

    public static void printNumberInWord(int number) {
        if (number == 0) {
            System.out.println("ZERO");
        } else if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("FOUR");
        } else if (number == 5) {
            System.out.println("FIVE");
        } else if (number == 6) {
            System.out.println("SIX");
        } else if (number == 7) {
            System.out.println("SEVEN");
        } else if (number == 8) {
            System.out.println("EIGHT");
        } else if (number == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year > 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static int getDaysInMonth (int month, int year){
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        String leapYear;
        if(isLeapYear(year)){
            leapYear = "yes";
        }else{
            leapYear = "No";
        }
        switch (month){
            case 9: case 4: case 6: case 11:
                return 30;
            case 2:
                switch (leapYear){
                    case "yes":
                        return 29;
                    case "No":
                        return 28;
                }
            default:
                return 31;

        }


    }
}



