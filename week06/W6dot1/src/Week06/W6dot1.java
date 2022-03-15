package Week06;

import java.util.Scanner;

public class W6dot1 {
    /**
     * Write a short Java program that does the following:
     *
     * 1) Tells the user what the program does.
     * 2) Prompts the user to an investment amount, for example, 1000.
     * 3) Gets the user's input and saves it. If the user's input is not a
     *    positive, non-zero value, display an error message, then loop back
     *    and prompt for a new value. Stay in this loop until you have a valid
     *    value.
     * 4) Prompts the user to enter an annual interest rate between 0 and 100.
     *    For example, 9 would be 9%.
     * 5) Gets the user's input and saves it. If the user's input is not positive
     *    or if it is greater than 100, display an error message, then loop back
     *    and prompt for a new value. Stay in this loop until you have a valid
     *    value.
     * 6) Using a method that you have written, calculate and display the future
     *    value of the investment for a period of 10 years.
     *    The formula for computing the future value of an investment is:
     *
     *    futureValue = investmentAmount x (1 + monthlyInterestRate)^(numberOfYears * 12)
     *
     * @param args
     */
    public static void main(String[] args) {
        // write your code here
        System.out.println("Given an investment amount and an annual interest rate, this program ");
        System.out.println("will calculate the future value of the investment for a period of");
        System.out.println("ten years.\n");
        displayTable(getInvestmentAmt(), getInterestPercent());
        System.out.println("\nGoodbye.");
    }


    /**
     *  prompts the user for an investment amount until a positive, non-zero
     *  amount is entered.
     *
     * @return positive, non-zero amount representing investment principle
     */
    public static double getInvestmentAmt() {
        double investmentAmt = 0;
        boolean showError = false;
        do {
            if (showError) {
                System.out.println("\nInvestment amount must be positive, non-zero number.");
            }
            investmentAmt = convertToDecimal("Enter the a positive, non-zero value for the investment");
            showError = true;
        } while (investmentAmt <= 0);

        return investmentAmt;
    }

    /**
     * Prompts the user for the percentage rate to be used in calculating
     * compound interest.
     *
     * @return decimal representing percentage to be used.
     */
    public static double getInterestPercent() {
        double interestPercent = 0;
        boolean showError = false;
        do {
            if (showError) {
                System.out.println("\nInterest amount must be positive, non-zero number between 1 and 100.");
            }
            interestPercent = convertToDecimal("Enter an annual interest rate, between 0 and 100");
            showError = true;
        } while (interestPercent <= 0 || interestPercent > 100);

        return interestPercent;
    }

    /**
     * prompts a user for a number and returns it
     *
     * @param message a short message to display to the user as a prompt.
     * @return the value of the number that the user inputs
     */
    public static double convertToDecimal(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message + ": ");

        return input.nextDouble();
    }


    /**
     * Iterates over the next ten years and calculates future values using the
     * user-provided principal amount and the interest rate percentage
     *
     * @param investmentAmount number representing the principal investment
     * @param interestRatePercent annual percentage
     */
    public static void displayTable(double investmentAmount, double interestRatePercent) {
        System.out.format("\nYears\tFuture Value\n");
        for(int currentYear = 1;currentYear <= 10;currentYear++){
            double futureValue = futureValue(investmentAmount, interestRatePercent, currentYear);
            System.out.format("%d\t\t$%.2f\n", currentYear, futureValue);
        }
    }

    /**
     * calculates the future value of an investment based on principal, interest rate, and  change in years.
     * futureValue = investmentAmount x (1 + monthlyInterestRate)^(numberOfYears * 12)
     *
     * @param investmentAmount the initial investment amount.
     * @param monthlyInterestRate the interest rate of the investment.
     * @param years the amount of elapsed years for a future value.
     * @return the future value of the investment.
     */
    public static double futureValue(double investmentAmount, double monthlyInterestRate, int years){
        double totalMonths = 12 * years;
        double rateDecimal = monthlyInterestRate / 100;
        double growthRate = 1 + (rateDecimal / 12);
        double compoundGrowth = Math.pow(growthRate, totalMonths);

        return investmentAmount * compoundGrowth;
    }


}
