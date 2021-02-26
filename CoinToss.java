package Chapter6;

import javax.swing.*;
import java.security.SecureRandom;

public class CoinToss {
    private int head = 0;
    private int tail = 0;

    public int flip() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(2);
    }

    public void tossCoin() {
        int response;
        do {
            if ( flip() == 1 ) {
                this.head++;
                JOptionPane.showMessageDialog(null,Status.HEADS);
            } else {
                this.tail++;
                JOptionPane.showMessageDialog(null,Status.TAILS);
            }
            response = JOptionPane.showConfirmDialog(null, "Press Yes to toss Coin Again, No or Cancel to Terminate");
        } while (response == 0);

    }

    public int getHeadCount() {
        return head;
    }

    public int getTailCount() {
        return tail;
    }


    public enum Status {
        HEADS, TAILS;
    }


}
