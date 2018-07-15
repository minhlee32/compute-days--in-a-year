import java.util.Scanner;

public class Application {
    private static int year;
    public static void main(String[] args) {
        System.out.println("Which year would you like to count days?");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();

        System.out.println("The number of days in this year is " + numbersOfDaysInAYear(year));

        }


    private static int numbersOfDaysInAYear(int year) {
        if (isLeapYear(year)) {
            return 366;
        } else return 365;

    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

}