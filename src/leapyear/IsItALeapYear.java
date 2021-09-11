package leapyear;

import java.util.Scanner;

/*
A year is a leap year if it is divisible by 4. However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.
 */
public class IsItALeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a year: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println(year);
    }
}
