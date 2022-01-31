package Week04;
import java.util.Scanner;

public class W04dot2 {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        final double  fedTax = 19.50;
        final double  stateTax = 8.78;

        System.out.println("Given your name, hours worked, and hourly wage, this program calculates your \n" +
                "gross pay, state withholding tax, federal withholding tax, and your net pay.\n" +
                "It then displays your pay stub.");

        System.out.print("Enter your first and last name: ");
        String employee = input.nextLine();

        System.out.print("Enter the hours you worked this week: ");
        double weeklyHrs = input.nextDouble();

        System.out.print("Enter your hourly wage: ");
        double wage = input.nextDouble();

        double  grossPay = wage * weeklyHrs;
        double deductions = fedTax + stateTax;

        System.out.println("\nPay Stub for " + employee);
        System.out.println("Hours worked: " + weeklyHrs);
        System.out.println("Hourly Wage: $" + String.format( "%.2f", wage ));
        System.out.println("Gross Pay: $" + String.format( "%.2f", grossPay ));
        System.out.println("State Tax Withheld: $" + String.format( "%.2f", stateTax ));
        System.out.println("Federal Tax Withheld: $" + String.format( "%.2f", fedTax ));
        System.out.println("Net Pay: $" +  String.format( "%.2f", (grossPay - deductions) ));

        System.out.println("\nGoodbye.");
    }

}

