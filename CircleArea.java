package Chapter6;

import javax.swing.*;
import java.util.Scanner;

//6.20 (Circle Area) Write an application that prompts the user for the radius of a circle and uses
//        a method called circleArea to calculate the area of the circle.
public class CircleArea {

    private double radius;

    public void radiusInput(){
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius (negative to quit): "));
        this.radius = radius;
    }

    public void calculateAreas(){
        radiusInput();
        while ( radius >= 0 ) {
            circleArea( radius );
        radiusInput();
        }
    }


    public void circleArea( double radius ) {
        JOptionPane.showMessageDialog(null, "Area is "+ Math.PI * Math.pow(radius,2.0));
    }

        public static void main( String args[] ) {
            CircleArea application = new CircleArea();
            application.calculateAreas();
        }
    }

