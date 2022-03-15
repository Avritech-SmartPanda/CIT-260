package Week06;

public class W6dot2 {
    /**
     * Write a short Java program that contains the following two methods:
     * 1) public static double celsiusToFahrenheit(double tempCelsius)
     * 2) public static double fahrenheitToCelsius(double tempFahrenheit)
     *
     * Your program should:
     * 1) Tell the user what the program does.
     * 2) Invoke the above two methods to compute and display the table shown below.
     * 3) Output a goodbye message.
     *
     * @param args
     */

    public static void main(String[] args) {
	// write your code here
        // Display table header
        System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\t\tCelsius");
        System.out.println("---------------------------------------------------");
        // Display data
        for (double celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0; celsius--, fahrenheit -= 10) {
            System.out.format(
                    "%.1f\t\t%.1f\t\t|\t%.1f\t\t\t%.2f\n",
                    celsius, celsiusToFahrenheit(celsius),
                    fahrenheit,fahrenheitToCelsius(fahrenheit)
            );
        }
        System.out.println("\nGoodbye");
    }




    /** Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
    /** Convert from Fahrenheit to Celsius */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
