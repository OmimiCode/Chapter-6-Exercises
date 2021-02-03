package Chapter6;

import javax.swing.*;

//(Exponentiation) Write a method integerPower(base, exponent) that returns the value of base exponent
//    For example, integerPower(3, 4) calculates 3 4 (or 3 * 3 * 3 * 3 ). Assume that exponent is a positive,
//    nonzero integer and that base is an integer. Use a for or while statement to control the calculation.
//    Do not use any Math class methods. Incorporate this method into an application that reads
//    integer values for base and exponent and performs the calculation with the integerPower method.
public class Exponentiation{


    private int base;
    private int exponent;
    private int integerPower =1;


    public void base() {
        this.base= Integer.parseInt(JOptionPane.showInputDialog("ENTER BASE"));
    }

    public int getBase() {
        return base;
    }

    public void exponent() {
        this.exponent= Integer.parseInt(JOptionPane.showInputDialog("ENTER EXPONENT"));
    }

    public int getExponent() {
        return exponent;
    }


    public void integerPower() {
        int counter = 1;
        while(counter <= exponent){
            this.integerPower *= base;
            counter++;
        }

    }

    public int getIntegerPower(){
        JOptionPane.showMessageDialog(null, " the Integer power of "+base + " raised to the power of " + exponent + " is " + integerPower);
        return integerPower;
    }


    public void findExponential(){
        base();
        exponent();
        integerPower();
        getIntegerPower();
    }

    public static void main(String[] args){
        Exponentiation application = new Exponentiation();
        application.findExponential();

    }
}









