package Week07;

import java.util.Scanner;

public class W7dot1 {
    /**
     * Write a program that:
     * 1) Tells the use what the program does.
     * 2) Prompts the user to enter five numbers.
     * 3) Saves the user's input in an array of doubles.
     * 4) Uses the methods above to compute the mean and the standard deviation
     *    for the numbers in the array.
     * 5) Displays the mean and the standard deviation with 2 digits after the
     *    decimal point.
     * 6) Displays a goodbye message.
     * 7) Your file should have the proper file prologue, and each method
     *    should have the proper method prologue.
     *
     * @param args
     */
    public static void main(String[] args) {
	// write your code here
        int desiredNumberOfNumbers = 5;
        double[] numbers = new double[desiredNumberOfNumbers];

        System.out.println("This program computes the mean and the standard deviation for a set of numbers.");
        for (int i = 0; i < desiredNumberOfNumbers; i++){
            System.out.print("Enter a number: ");
            numbers[i] = new Scanner(System.in).nextDouble();
        }
        System.out.format("\nThe mean of this set of numbers is %.2f\n", mean(numbers));
        System.out.format("The standard deviation is %.2f\n", deviation(numbers));
        System.out.println("Goodbye...");
    }


    /**
     * Calculates the average from an array of numbers
     *
     * @param numArray the list of numbers to have averaged
     * @return the average of all the numbers in the list
     */
    public static double mean(double[] numArray) {
        double total = 0;
        for (double num : numArray) total += num;

        return total / numArray.length;
    }


    /**
     * Calculates the standard deviation for a sample set
     *
     * @param array the numbers of the sample set
     * @return the standard deviation for a sample set
     */
    public static double deviation(double[] array) {
        double standardDeviation = 0;
        double average = mean(array);

        double[] deviations = new double[array.length];
        for (int i = 0; i < array.length; i++){
            deviations[i] = Math.pow(array[i] - average, 2);
        }

        double averageDeviation = 0;
        for (double deviation : deviations) averageDeviation += deviation;
        averageDeviation = averageDeviation / (deviations.length - 1);
        standardDeviation = Math.sqrt(averageDeviation);

        return standardDeviation;
    }


}
