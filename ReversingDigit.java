package Chapter6;

import java.util.Scanner;

//6.26 (Reversing Digits) Write a method that takes an integer value and returns the number with
//        its digits reversed. For example, given the number 7631, the method should return 1367. Incorpo-
//        rate the method into an application that reads a value from the user and displays the result.
public class ReversingDigit {

    public int reverse(int number) {
        int reverseNumber = 0;
        while (number > 0) {
            int placeValue = number % 10;
            number /= 10;
            reverseNumber = (reverseNumber * 10) + placeValue;
        }
        return reverseNumber;
    }


    public void reverseDigit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer (-1 to exit): ");
        int number = input.nextInt();
        while (number != -1) {
            System.out.printf("%d reversed is %d\n", number, reverse(number));
            System.out.print("Enter an integer (-1 to exit): ");
            number = input.nextInt();
        }
    }


    public static void main(String[] args) {
        ReversingDigit app = new ReversingDigit();
        app.reverseDigit();
    }
}