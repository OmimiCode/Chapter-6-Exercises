package Chapter6;

import javax.management.Query;
import javax.swing.*;
import java.util.Scanner;

/*6.17 (Even or Odd) Write a method isEven that uses the remainder operator ( % ) to determine
        whether an integer is even. The method should take an integer argument and return true if the in-
        teger is even and false otherwise. Incorporate this method into an application that inputs a se-
        quence of integers (one at a time) and determines whether each is even or odd.*/
public class Even_Odd {

Scanner scanner = new Scanner(System.in);
    private int query;

    public void query() {
       this.query= Integer.parseInt(JOptionPane.showInputDialog(null,"enter query"));
    }

    public int getQuery() {
        return query;
    }

    public boolean isEven(int query) {
        return query % 2 == 0;
    }


    public void even_Odd_checker(){
        int confirmation = JOptionPane.showConfirmDialog(null, "DO YOU WANT TO QUERY A NUMBER ");
        while(confirmation == JOptionPane.YES_OPTION){
            query();
            if(isEven(query)){
                JOptionPane.showMessageDialog(null, query+ " is EVEN");
            }else{
                JOptionPane.showMessageDialog(null, query + " is ODD");
            }
        }
    }





    public static void main(String[] args) {
        Even_Odd even_odd = new Even_Odd();
        even_odd.even_Odd_checker();
    }
}
