package Week02;

import java.util.Scanner;

public class W02dot1 {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("This program converts a temperature in degrees Celsius into a temperature in degrees Fahrenheit. Enter a temperature in degrees Celsius: ");
        double c = in.nextDouble();
        double f = ((c * 9)/5)+32;
        System.out.println( String.format( "%.2f", c ) + " degrees Celsius is equal to " + String.format( "%.2f", f ) + " degrees Fahrenheit.\nGoodbye.");
    }
}
