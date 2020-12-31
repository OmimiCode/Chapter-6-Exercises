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


    private double input;
    private double celsius;
    private double fahrenheit;

    public void input() {
        double input = Double.parseDouble(JOptionPane.showInputDialog("enter temperature to be converted : "));
        this.input = input;
    }

    public double getInput() {
        return  input;
    }

    public double fahrenheitToCelsius(double input) {
        return celsius = 5.0 / 9.0 * (input - 32);
    }

    public double celsiusToFahrenheit(double input) {
        return fahrenheit = 9.0 / 5.0 * input + 32;
    }



}

