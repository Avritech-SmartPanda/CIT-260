package Week05;

public class W5dot2 {

    public static void main(String[] args) {
	// write your code here
        /**
         * Displays a brief explanation of what the program does to the user.
         */
        System.out.println("This program displays all of the numbers from 100 to 1000");
        System.out.println("that are divisible by both 5 and 6.\n");


        /**
         * Displays numbers between 100 and 1000 that are evenly divisible by 6 and 5.
         * There should be a single space between numbers and 10 numbers per line.
         */
        int numbersPerLine = 10;
        int displayedNumbers = 0;
        int startNumber = 100;
        int maxNumber = 1000;
        for (int num = startNumber; num < maxNumber; num++) {
            if (num % 5 == 0 && num % 6 == 0) {
                System.out.print(num + " ");
                displayedNumbers++;
                if (displayedNumbers == numbersPerLine) {
                    System.out.print("\n");
                    displayedNumbers = 0;
                }
            }
        }


        System.out.println("\nGoodbye.");
    }
}
