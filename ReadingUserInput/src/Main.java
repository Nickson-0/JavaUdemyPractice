import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        adder();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date of birth");
        int yearOfBirth = scanner.nextInt();
        System.out.println("Enter your name: ");
        String name = scanner.next();
        int age = 2019 - yearOfBirth;
        System.out.println("Your name is " + name + " and you are " + age + "years old");

        scanner.close();
    }

    public static void adder (){
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while(count <= 10){
            System.out.println("Enter Number #" + count);
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                sum += number;
                count ++;
            }else{
                System.out.println("Invalid Value");
                scanner.nextLine();
            }
        }
        System.out.println("The sum of the numbers is " + sum);
        //scanner.close();
    }

    public static void minMax (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of numbers");
        if(scanner.hasNextInt()){
            int number = scanner.nextInt();





        }
    }
}

