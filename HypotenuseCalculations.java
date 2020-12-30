package Chapter6;

import javax.swing.*;

/*Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
        a right triangle when the lengths of the other two sides are given.
        The method should take two arguments of type double and return the hypotenuse as a double .
        Incorporate this method into an application that reads values for side1 and side2 and performs the calculation with the hypotenuse
        method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
        triangles in Fig. 6.15. [Note: Class Math also provides method hypot to perform this calculation.]*/
public class HypotenuseCalculations {


    private double inputOfSide1;
    private double inputOfSide2;
    private double hypotenuse;

    public void inputOfSide1() {
        this.inputOfSide1 = Double.parseDouble(JOptionPane.showInputDialog("enter side1"));
    }

    public double getInputOfSide1() {
        return inputOfSide1;
    }


    public void inputOfSide2() {
        this.inputOfSide2 = Double.parseDouble(JOptionPane.showInputDialog("enter side2"));
    }

    public double getInputOfSide2() {
        return inputOfSide2;
    }


    public void hypotenuse() {
        //double hypotenuse = Math.sqrt(Math.pow(inputOfSide1,2.0) + Math.pow(inputOfSide2,2.0));
      this.hypotenuse = Math.hypot(inputOfSide1, inputOfSide2);

    }


    public double getHypotenuse() {
        return hypotenuse;
    }

    //=============================================method 2=================================================
    public double hypotenuse(double inputOfSide1, double inputOfSide2) {
        //double hypotenuse = Math.sqrt(Math.pow(inputOfSide1,2.0) + Math.pow(inputOfSide2,2.0));
        return hypotenuse = Math.hypot(inputOfSide1, inputOfSide2);
    }

    public void calculateHypotenuse() {
        inputOfSide1();
        while (inputOfSide1>0){
            inputOfSide2();
            JOptionPane.showMessageDialog(null, "HYPOTENUSE IS : "+hypotenuse(inputOfSide1, inputOfSide2) );
            inputOfSide1();

        }
    }

    public double getCalculatedHypotenuse() {
        return hypotenuse;
    }

//================================================main method ===========================================================

    public static void main(String[] args) {
        HypotenuseCalculations hypotenuseCalculations = new HypotenuseCalculations();
        hypotenuseCalculations.calculateHypotenuse();
    }

}
