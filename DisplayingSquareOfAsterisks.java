package Chapter6;

import javax.swing.*;

/*6.18 (Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid
        square (the same number of rows and columns) of asterisks whose side is specified in integer param-
        eter side . For example, if side is 4 , the method should display
        ****
        ****
        ****
        ****
        Incorporate this method into an application that reads an integer value for side from the user and
        outputs the asterisks with the squareOfAsterisks method.*/
public class DisplayingSquareOfAsterisks {

    private int rows;

    public void numberOfRow(){
        this.rows = Integer.parseInt(JOptionPane.showInputDialog("enter number of rows of asterisks to print"));
    }

    public int getNumberOfRows() {
        return rows;
    }


    public void printAsterisks(int rows) {
        for (int counter = 1; counter <= rows * rows; counter++) {
            System.out.print(" * ");
            if (counter % rows == 0) {
                System.out.println();
            }
        }
    }

    public void drawPrintAsterisks() {
       numberOfRow();
       printAsterisks(rows);
    }


    public static void main(String[] args) {
        DisplayingSquareOfAsterisks displayingSquareOfAsterisks = new DisplayingSquareOfAsterisks();
        displayingSquareOfAsterisks.drawPrintAsterisks();
    }

}