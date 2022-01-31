package Week04;
import java.util.Scanner;

public class W04dot1 {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("This program converts a hexadecimal digit into a four digit binary number.");
        System.out.println("Enter a hexadecimal number: ");

        String hex = input.nextLine();

        int digit = hexValue(hex.charAt(0) );
        if (digit == -1) {
            System.out.println(hex + " is not a valid hexadecimal digit.\nGoodbye.");
        }


        if (digit != -1) {
            int num = Integer.parseInt(hex, 16);
            String binary = Integer.toBinaryString(num);
            System.out.println("The binary value is : " + binary + "\nGoodbye.");
        }
    }




    static int hexValue(char ch) {
        switch (ch) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'a':
            case 'A':
                return 10;
            case 'b':
            case 'B':
                return 11;
            case 'c':
            case 'C':
                return 12;
            case 'd':
            case 'D':
                return 13;
            case 'e':
            case 'E':
                return 14;
            case 'f':
            case 'F':
                return 15;
            default:
                return -1;
        }
    }
}

