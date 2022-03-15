package Week09;

import java.util.Scanner;

public class W09 {

    public static void main(String[] args) {
	// write your code here
        System.out.println("This program creates a point at (0,0) and a point at the coordinates");
        System.out.println("entered by you. It then computes and displays the distance from (0,0)");
        System.out.println("to the point defined by you, using three different methods.");

        int x = promptPoint("Enter the x coordinate of a point: ");
        int y = promptPoint("Enter the y coordinate of a point: ");

        MyPoint definedPoint = new MyPoint();
        MyPoint customPoint = new MyPoint(x, y);

        double[] values = {
                customPoint.distance(definedPoint.getX(), definedPoint.getY()),
                customPoint.distance(definedPoint),
                MyPoint.distance(definedPoint, customPoint)
        };

        for (int i = 0; i < values.length; i++){
            System.out.format(
                    "Using method %d, the distance from %s to %s is %.2f\n",
                    i + 1,
                    definedPoint.toString(),
                    customPoint.toString(),
                    values[i]
            );
        }

        System.out.println("Goodbye...");
    }

    /**
     * Prompts the user for the value of a point using provided message
     *
     * @param msg a quick message to display
     * @return the value entered by the user
     */
    public static int promptPoint(String msg){
        Scanner input = new Scanner(System.in);
        System.out.print(msg);
        return input.nextInt();
    }



}


