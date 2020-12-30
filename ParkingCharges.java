package Chapter6;
import javax.swing.*;

public class ParkingCharges {

    private int hoursParked;
    public static final double minimumCharges = 2.0;
    public static final double maximumCharges = 10.0;
    public static final double additionalChargesPerHour = .5;
    private double charges;
    private String customerName;

    public void setCustomerName() {
        String customerName = JOptionPane.showInputDialog("Enter Customer's Name");
        this.customerName = customerName.toUpperCase();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void hoursParked() {
      int  hoursParked = Integer.parseInt(JOptionPane.showInputDialog("Enter Number Of Hours Parked Yesterday"));
        while(hoursParked <1 || hoursParked>24){
            hoursParked = Integer.parseInt(JOptionPane.showInputDialog("Enter Number Of Hours Parked Yesterday"));
        }
    this.hoursParked= hoursParked;
    }

    public int getHoursParked() {
        return hoursParked;
    }

    public void calculateCharges() {
        if(hoursParked <=3 ){
        this.charges = minimumCharges;
            JOptionPane.showMessageDialog(null, customerName+ ", your charges for " + hoursParked + " hour(s) is  $"+charges);
        }else{
            if(hoursParked > 3){
                this.charges = ((hoursParked - 3)*additionalChargesPerHour)+ minimumCharges;
                JOptionPane.showMessageDialog(null, customerName+ ", your  charges for " + hoursParked + " hour(s) parked is $"+charges);
                if(charges > 10){
                    JOptionPane.showMessageDialog(null, "maximum charges exceeded! \n" +
                            customerName+ ", your normal charge is supposed to be $"+charges+"\n"+
                            "Due to our  daily policy, \n" +
                            "Our customer are to pay the daily maximum charge of $"+maximumCharges);
                    this.charges=maximumCharges;
                }
            }
        }
    }

    public double getCalculatedCharges() {
        return charges;
    }
}
