package Chapter6;
/*6.22
        (Temperature Conversions) Implement the following integer methods:
        a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the
        calculation
        celsius = 5.0 / 9.0 * (fahrenheit - 32);
        b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using
        the calculation
        fahrenheit = 9.0 / 5.0 * celsius + 32;
        c) Use the methods from parts (a) and (b) to write an application that enables the user
        either to enter a Fahrenheit temperature and display the Celsius equivalent or to enter a
        Celsius temperature and display the Fahrenheit equivalent.*/

import javax.swing.*;
import java.util.Scanner;

public class TemperatureConversion {


    private int input;
    private int celsius;
    private int fahrenheit;

    public void input() {
        int input = Integer.parseInt(JOptionPane.showInputDialog("enter temperature to be converted : "));
        this.input = input;
    }

    public int getInput() {
        return  input;
    }

    public int fahrenheitToCelsius(int input) {
        return celsius = (int) (5.0 / 9.0 * (input - 32));
    }

    public int celsiusToFahrenheit(int input) {
        return fahrenheit = (int) (9.0 / 5.0 * input + 32);
    }

    public void convertTemperatures()
    {
        Scanner input = new Scanner( System.in );
        int choice; // the user's choice in the menu
        do {
            System.out.println( "press 1. Fahrenheit to Celsius" );
            System.out.println( "press 2. Celsius to Fahrenheit" );
            System.out.println( "press 3. Exit" );
            System.out.print( "Choice: " );
            choice = input.nextInt();
            if ( choice != 3 ){
                System.out.print( "Enter temperature: " );
                int userInput = input.nextInt();

                switch ( choice ){
                    case 1:
                        System.out.printf( "%d Fahrenheit is %d Celsius\n",
                                userInput, fahrenheitToCelsius(userInput));
                        break;
                    case 2:
                        System.out.printf( "%d Celsius is %d Fahrenheit\n",
                                userInput, celsiusToFahrenheit(userInput));
                        break;
                }
            }
        } while ( choice != 3 );
    }


    public static void main(String[] args) {
        TemperatureConversion application = new TemperatureConversion();
        application.convertTemperatures();
    }
}

