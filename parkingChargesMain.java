package Chapter6;

import javax.swing.*;

public class parkingChargesMain {
    public static void main(String[] args) {
        ParkingCharges parkingCharges = new ParkingCharges();
        int sentinel= JOptionPane.showConfirmDialog(null,
                 "PRESS YES TO CONTINUE?");

         while (sentinel == JOptionPane.YES_OPTION){
              parkingCharges.setCustomerName();
             parkingCharges.hoursParked();
             parkingCharges.calculateCharges();

        }

    }
}
