package Week02;
/* Write a short Java program that does the following:

* Tells the user what the program does.
* Prompts the user to enter a value for the cost of their meal.
* Gets the user's input and saves it in a variable declared as a double.
* Prompts the user to enter a percentage value for the tip.
* Gets the user's input and saves it in a variable declared as a double.
* Calculates the value of the tip, using the percentage entered by the user.
* Calculates the tax on the meal. The tax rate is 3.2%.
* Calculates the total bill = meal cost + tip + tax.
* Outputs the tip, the tax, and the total value of the bill.
* All values will be formatted to show a dollar sign and 2 digits after the decimal point.
* Outputs a goodbye message.
 */
import java.util.Scanner;

public class W02dot2 {

    public static void main(String[] args) {
	// write your code here
        double mealCharge;
        final double tax = 3.2; // 3.2% constant amount of meal charge
        double taxAmount;
        double totalWithTax;
        double tip;
        double tipAmount;
        double totalBill;

        Scanner input = new Scanner(System.in);

        //user has to enter the charge for the meal.
        System.out.println("Given the price of a meal and a percentage to use for the tip, \nthis program calculates the tip, the tax, and the total amount of the bill.\nEnter the cost of the meal: ");
        mealCharge = input.nextDouble();

        //user has to enter tip percentage.
        System.out.println("Enter the tip percentage: ");
        tip = input.nextDouble() ;

        //calculate meal charge, tax amount, tip amount, and total bill
        taxAmount = mealCharge * (tax/100);
        totalWithTax = mealCharge + taxAmount;
        tipAmount = mealCharge * (tip/100);
        totalBill = totalWithTax + tipAmount;

        //display to user tip amount, tax amount, and total bill.
        System.out.println("The tip is $" + String.format( "%.2f", tipAmount ) );
        System.out.println("The tax is $" + String.format( "%.2f", taxAmount ) );
        System.out.println("The total bill is $" + String.format( "%.2f", totalBill ) + "\nGoodbye.");


/*
        Scanner in = new Scanner(System.in);
        double c = in.nextDouble();
        double f = ((c * 9)/5)+32  ;
        System.out.println( String.format( "%.2f", c ) + " degrees Celsius is equal to " + String.format( "%.2f", f ) + " degrees Fahrenheit.\nGoodbye.");
*/
    }
}
