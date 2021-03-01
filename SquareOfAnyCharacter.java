package Chapter6;

import Chapter4.SquaresOfAsterisks;

import javax.swing.*;
import java.util.Scanner;

//6.19 (Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to re-
//        ceive a second parameter of type char called fillCharacter . Form the square using the char pro-
//        vided as an argument. Thus, if side is 5 and fillCharacter is # , the method should display
//        #####
//        #####
//        #####
//        #####
//        #####
//        Use the following statement (in which input is a Scanner object) to read a character from the user
//        at the keyboard:
//        char fill = input.next().charAt(0);
public class SquareOfAnyCharacter {

    Scanner input = new Scanner( System.in );
    private int row;
    private char fill;

    public void numberOfRow(){
        System.out.print( "Enter square size: " );
        this.row = input.nextInt();
    }


    public void fillCharacter(){
        System.out.print( "Enter fill character: " );
        char fill = input.next().charAt( 0 );
        this.fill = fill;
    }


    public void printCharacter(int rows, char fill) {
        for (int counter = 1; counter <= rows * rows; counter++) {
            System.out.print(" ");
            System.out.print( fill);
            if (counter % rows == 0) {
                System.out.println();
            }
        }
    }

    public void drawPrintCharacter() {
        numberOfRow();
        fillCharacter();
        printCharacter(row,fill);
    }


    public static void main(String[] args) {
        SquareOfAnyCharacter squareOfAnyCharacter = new SquareOfAnyCharacter();
        squareOfAnyCharacter.drawPrintCharacter();
    }






}
