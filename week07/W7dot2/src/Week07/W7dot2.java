package Week07;

public class W7dot2 {
    /**
     * Write a short Java program that does the following:
     * 1) Tells the user what the program does. Note that no user input is required for this program.
     * 2) Creates a one-dimensional array of Strings and stores the employee names from the above table in that array.
     * 3) Creates a two-dimensional array and stores the hourly data from the table above in that array.
     * 4) Adds up the number of hours for each employee and stores the results in a one-dimensional array.
     * 5) Displays a goodbye message.
     *
     * @param args main argument
     */
    public static void main(String[] args) {
        // write your code here
        // Creates a one-dimensional array of Strings and stores the employee names.
        String[] employees = new String[]{
                "Tara Teamlead ",
                "Harry Hacker ",
                "Carl Coder ",
                "Paula Programmer",
                "Darrin Debugger "
        };

        // Creates a two-dimensional array and stores the hourly data.
        double[][] hourlyData = {
                { 0.0, 8.0, 8.0, 8.5, 8.0, 9.0, 0.0 },
                { 0.0, 9.0, 9.0, 8.5, 8.0, 7.5, 0.0 },
                { 0.0, 8.5, 8.0, 8.6, 8.6, 9.5, 2.0 },
                { 0.0, 4.75, 6.0, 6.25, 6.5, 0.0, 0.0 },
                { 0.0, 0.0, 0.0, 0.0, 5.25, 5.25, 6.0 },
        };

        double[] totalHoursPerEmployee = getTotalHrs(hourlyData);
        System.out.println("This Program computes the number of hours worked for a set of hourly employees.\n");
        System.out.println("Employee Name\t\t\tTotal Hours");
        for (int i = 0; i < totalHoursPerEmployee.length; i++) {
            System.out.format("%-16s\t\t%.2f\t\t\n", employees[i], totalHoursPerEmployee[i]);

        }
        System.out.println("\nGoodbye");

        // Sort the array that contains the total hours for each employee from the highest number of hours to the lowest.
        // You must use a selection sort to do this (see listing 7.8 in the textbook).
        // Then display the output so that it looks like the following
        // (hint: you have to sort the names as you sort the number of hours):
        System.out.println("This Program computes the number of hours worked for a set of hourly employees.\n");

        int[] indexList = new int[totalHoursPerEmployee.length];
 double[] sortedHrs =  displaySortedDecreasingHrs(totalHoursPerEmployee, indexList);

        System.out.println("Employee Name\t\t\tTotal Hours");
        for (int i = 0; i < sortedHrs.length; i++) {
            System.out.format("%-16s\t\t%.2f\t\t\n", employees[i], sortedHrs[i]);
        }
        System.out.println("\nGoodbye");
    }


    /**
     * Calculates the total from an array of numbers
     *
     * @param hrs per week
     * @return total hours per week
     */
    public static double[] getTotalHrs(double[][] hrs) {
        double[] totalHoursPerEmployee = new double[hrs.length];

        for (int i = 0; i < hrs.length; i++) {
            double sum = 0.00;
            for (int j = 0; j < hrs[i].length; j++) {
                sum += hrs[i][j];
            }
            totalHoursPerEmployee[i] = sum;
        }
        return totalHoursPerEmployee;
    }


    /**
     * Sorts the hours from an array of numbers
     *
     * @param totalHours the list of numbers to have averaged
     * @return the total sorted hours list
     */
    public static double[] displaySortedDecreasingHrs(double[] totalHours, int[] indexList) {
        for (int i = 0; i < indexList.length; i++) {
            indexList[i] = i;
        }

        for (int i = 0; i < totalHours.length; i++) {
            double currentMax = totalHours[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < totalHours.length; j++) {
                if (currentMax < totalHours[j]) {
                    currentMax = totalHours[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                totalHours[currentMaxIndex] = totalHours[i];
                totalHours[i] = currentMax;

                int temp = indexList[currentMaxIndex];
                indexList[currentMaxIndex] = indexList[i];
                indexList[i] = temp;
            }
        }


        return totalHours;
    }













}











