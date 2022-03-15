package Week09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        displayIntro();
        int x = promptPoint("Enter the x coordinate of a point");
        int y = promptPoint("Enter the y coordinate of a point");

        Point def = new Point();
        Point custom = new Point(x, y);

        double[] values = {
                custom.distance(def.getX(), def.getY()),
                custom.distance(def),
                Point.distance(def, custom)
        };

        for (int i = 0; i < values.length; i++){
            System.out.format(
                    "Using method %d, the distance from %s to %s is %.2f\n",
                    i + 1,
                    def.toString(),
                    custom.toString(),
                    values[i]
            );
        }

        sayGoodbye();
    }

    /**
     * Prompts the user for the value of a point using provided message
     *
     * @param msg a quick message to display
     * @return the value entered by the user
     */
    public static int promptPoint(String msg){
        Scanner input = new Scanner(System.in);
        System.out.print(msg + ": ");

        return input.nextInt();
    }

    /**
     * Displays an introduction to the program in a user-friendly way
     */
    public static void displayIntro() {
        System.out.println("This program creates a point at (0,0) and a point at the coordinates");
        System.out.println("entered by you. It then computes and displays the distance from (0,0)");
        System.out.println("to the point defined by you, using three different methods.");
    }

    /**
     * “For once I’m stuck without a punchline.”
     *      ~The Joker
     */
    public static void sayGoodbye(){
        System.out.println("Goodbye...");
    }
}


