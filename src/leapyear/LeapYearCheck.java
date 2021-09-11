package leapyear;

import java.util.Scanner;

/*
A year is a leap year if it is divisible by 4. However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.
 */
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a year: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Is " + year + " a leap year?");
//        if (year % 4 != 0) {
//            System.out.println(year + " is not a leap year.");
//        } else if (year % 100 == 0 && year % 400 != 0) {
//            System.out.println(year + " is not a leap year.");
//        } else {
//            System.out.println(year + " is a leap year");
//        }
        String finalStatement = (year % 4 != 0) ? "Unfortunately not."
                : (year % 100 == 0 && year % 400 != 0) ? "Unfortunately not."
                : "Yes, " + year + " is a leap year.";
        System.out.println(finalStatement);
    }
}
