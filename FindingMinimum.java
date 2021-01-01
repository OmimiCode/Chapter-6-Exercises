package Chapter6;

import javax.swing.*;

/*6.23 (Find the Minimum) Write a method minimum3 that returns the smallest of three floating-
        point numbers. Use the Math.min method to implement minimum3 . Incorporate the method into an
        application that reads three values from the user, determines the smallest value and displays the re-
        sult.*/
public class FindingMinimum {
    private double input1;
    private double input2;
    private double input3;


    public void input1() {
        this.input1= Double.parseDouble(JOptionPane.showInputDialog("enter first number"));
    }

    public double getInput1() {
        return input1;
    }

    public void input2() {
        this.input2= Double.parseDouble(JOptionPane.showInputDialog("enter second number"));
    }

    public double getInput2() {
        return input2;
    }

    public void input3() {
        this.input3=Double.parseDouble(JOptionPane.showInputDialog("enter third number"));
    }

    public double getInput3() {
        return  input3;
    }

    public double minimum3(double input1, double input2, double input3) {
        return Math.min(Math.min(input1,input2),input3);
    }

    public void findMinimum() {
       int choice = JOptionPane.showConfirmDialog(null, "Do you want to find minimum of any three floating numbers ? ");
        while(choice == JOptionPane.YES_OPTION){
            input1();
            input2();
            input3();
           JOptionPane.showMessageDialog(null," The minimum is  "+minimum3(input1,input2, input3));
           choice = JOptionPane.showConfirmDialog(null, "Do you want to find minimum of any three floating numbers ? ");
        }
    }

    public double getMinimum() {
        return 0;
    }


    public static void main(String... args) {
        FindingMinimum app = new FindingMinimum();
        app.findMinimum();
    }
}
