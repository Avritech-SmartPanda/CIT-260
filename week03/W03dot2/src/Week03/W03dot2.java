package Week03;

import java.util.Scanner;

public class W03dot2 {

    public static void main(String[] args) {
        // write your code here
        int daysInMonth = 0;
        String monthName = "Unknown";

        Scanner input = new Scanner(System.in);

        System.out.print("Given a year and a month in that year, this program will tell you\nthe number of days in that month.");
        System.out.print("\nEnter a year: ");

        int year = input.nextInt();

        System.out.print("Enter a value for the month(1 = Jan, 2 = Feb, etc): ");
        int month = input.nextInt();

        if (month > 0 && month < 13) {

            switch (month) {
                case 1:
                    monthName = "January";
                    daysInMonth = 31;
                    break;
                case 2:
                    monthName = "February";
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
                case 3:
                    monthName = "March";
                    daysInMonth = 31;
                    break;
                case 4:
                    monthName = "April";
                    daysInMonth = 30;
                    break;
                case 5:
                    monthName = "May";
                    daysInMonth = 31;
                    break;
                case 6:
                    monthName = "June";
                    daysInMonth = 30;
                    break;
                case 7:
                    monthName = "July";
                    daysInMonth = 31;
                    break;
                case 8:
                    monthName = "August";
                    daysInMonth = 31;
                    break;
                case 9:
                    monthName = "September";
                    daysInMonth = 30;
                    break;
                case 10:
                    monthName = "October";
                    daysInMonth = 31;
                    break;
                case 11:
                    monthName = "November";
                    daysInMonth = 30;
                    break;
                case 12:
                    monthName = "December";
                    daysInMonth = 31;
            }
            System.out.println(monthName + " of " + year + " has " + daysInMonth + " days in it.\nGoodbye");
        } else {
            System.out.println(month + " is invalid. Month values must be between between 1 and 12, inclusive.\nGoodbye");
        }

    }



}
