package Chapter6;

import java.util.Scanner;
public class SeparatingDigits {

    public int quotient(int a, int b) {
        return a / b;
    }

    public int remainder(int a, int b) {
        return a % b;
    }

    public void separateDigits() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer (0 to exit): ");
        int number = input.nextInt();
        while (number != 0) {
            if (number <= 99999 && number >= 1)
                displayDigits(number);
            else
                System.out.println("number must be between 1 and 99999");
            System.out.print("Enter the integer (0 to exit): ");
            number = input.nextInt();
        }
    }





    public void displayDigits(int number) {
        int divisor = 1;
        int digit;
        String result = "";
// Loop for highest divisor
        for (int i = 1; i < number; i *= 10)
            divisor = i;
        while (divisor >= 1) {
            digit = quotient(number, divisor);
            result += digit + " ";
            number = remainder(number, divisor);
            divisor = quotient(divisor, 10);
        } System.out.println(result);
    }



        public static void main( String args[]){
            SeparatingDigits application = new SeparatingDigits();
            application.separateDigits();
        }
    }

