package Chapter6;
//6.16 (Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
//        second integer is a multiple of the first. The method should take two integer arguments and return
//        true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
//        Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
//        time) and determines whether the second value in each pair is a multiple of the first.

import javax.swing.*;

public class Multiples {


    private int query;
    private int argument;
    public void query() {
        this.query = Integer.parseInt(JOptionPane.showInputDialog("enter number to query "));
    }

    public int getQuery() {
        return query;
    }

    public void argument() {
        this.argument = Integer.parseInt(JOptionPane.showInputDialog("enter number to check if its a  multiple of query"));
    }

    public int getArgument() {
        return argument;
    }


    public boolean isMultiple(int query, int argument) {
    return query % argument == 0;
    }


    public void checkMultiplicity(){
        query();
        while(query!=0){
            argument();
            if(isMultiple(query, argument)){
                JOptionPane.showMessageDialog(
                        null, argument+" is a multiple of "+query);
            }else{
                JOptionPane.showMessageDialog(
                        null, argument+" is NOT a multiple of "+query);
            }
            query();
        }
    }


    public static void main(String[] args) {
        Multiples multiples = new Multiples();
        multiples.checkMultiplicity();
    }
}
