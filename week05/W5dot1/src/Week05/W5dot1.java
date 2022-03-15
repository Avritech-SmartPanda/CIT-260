package Week05;

public class W5dot1 {

    public static void main(String[] args) {
	// write your code here
        /**
         * Displays an introduction
         */
        System.out.println("This Program displays a table of kilogram to punds conversions.\n");

        /**
         * Displays pounds to kilograms tables for 1-15 kilograms
         */
        System.out.println("kilograms\tpounds");
        System.out.println("---------\t------");
        int kiloLimit = 15; // Only expect 1-15 in output
        for (int kilo = 1; kilo <= kiloLimit; kilo++){
            float lbsPerKilo = 2.2f; // 1 kilogram = 2.2 pound
            float lbs = kilo * lbsPerKilo;
            System.out.format("%d\t\t\t%.1f\n", kilo, lbs);
        }
        System.out.println("\nGoodbye.");
    }



}
