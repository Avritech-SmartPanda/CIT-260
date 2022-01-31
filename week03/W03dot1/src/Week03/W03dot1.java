package Week03;

import java.util.Scanner;

public class W03dot1 {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Given today's day of the week and some number of days in the future\nthis program will tell you the day of the week for the future day.");
        System.out.print("\nEnter today's day of the week (0 for Sunday, 1 for Monday, etc): ");
        int day = input.nextInt();
        if(day >= 7){
            System.out.println(day + " is invalid. You must enter a number less than 7.\nGoodbye.");
        }else{
            String todayDay = convertToString(day);
            System.out.print("Enter the number of days in the future: ");
            int after = input.nextInt();
            if(after > 0 ){
                int futureDay = day + after % 7;
                System.out.println("Today is " + todayDay + " and the future day is " + convertToString(futureDay) +"\nGoodbye.");
            }else{
                System.out.println(after + " is invalid. You must enter a positive number.\nGoodbye.");
            }
        }

    }

    public static String convertToString(int day)
    {
        String dayName = "";

        switch(day)
        {
            case 0:
                dayName= "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6 :
                dayName = "Saturday";
                break;
        }

        return dayName;
    }

}
