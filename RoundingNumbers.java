package Chapter6;

import javax.swing.*;

public class RoundingNumbers {
    private double y;
    private double  x;

    public void setTheValuesOfX(){
       double x = Double.parseDouble(JOptionPane.showInputDialog("enter the value of x "));
        this.x=x;
    }

    //a) roundToInteger(number)
    public void setYToRoundToInteger(){
        int y = (int)Math.floor( x + 0.5);
           this.y= y;


    }
    public double getYRoundedToInteger(){
        System.out.println("the Math.floor rounded value to the nearest Integer not greater than " + x + " + 0.5 is " + y);
        return y;
    }

    //b) roundToTenths(number)
    public void setYToRoundToTenths(){
        double y = Math.floor( x *10 + 0.5)/10;
        this.y= y;


    }

    public double getYRoundedToTenths(){
        System.out.println("the Math.floor rounded value to the nearest Tenths not greater than " + x + " + 0.5 is " + y);
        return y;
    }


    //c) roundToHundredths(number)
    public void setYToRoundToHundredths(){
        double y = Math.floor( x * 100 + 0.5)/100;
        this.y= y;
    }

    public double getYRoundedToHundredths(){
        System.out.println("the Math.floor rounded value to the nearest Hundredth not greater than " + x + " + 0.5 is " + y);
        return y;
    }


    //d) roundToThousandths(number)
    public void setYToRoundToThousandths(){
        double y = Math.floor( x *1000 + 0.5)/1000;
        this.y= y;
    }
    public double getYRoundedToThousandths(){
        System.out.println("the Math.floor rounded value to the nearest thousandth not greater than " + x + " + 0.5 is " + y);
        return y;
    }




    public static void main(String[] args) {
        RoundingNumbers roundingNumbers = new RoundingNumbers();
        roundingNumbers.setTheValuesOfX();

        roundingNumbers.setYToRoundToInteger();
        roundingNumbers.getYRoundedToInteger();

        roundingNumbers.setYToRoundToTenths();
        roundingNumbers.getYRoundedToTenths();

        roundingNumbers.setYToRoundToHundredths();
        roundingNumbers.getYRoundedToHundredths();

        roundingNumbers.setYToRoundToThousandths();
        roundingNumbers.getYRoundedToThousandths();


    }
}


