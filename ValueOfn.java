package Chapter6;

import java.security.SecureRandom;

public class ValueOfn {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
//        int n = 1+random.nextInt(2);
//        int n = 1+random.nextInt(100);
//        int n = random.nextInt(10);
//        int n = 1000+random.nextInt(113);
//        int n = -1+random.nextInt(3);
//        int n = -3+random.nextInt(15);
//        System.out.println(n);



//        Write statements that will display a random number from each of the following sets:
//        a) 2, 4, 6, 8, 10.
//        int set = 2 +  2* random.nextInt( 5);
//        System.out.println(set);

//        b) 3, 5, 7, 9, 11.
//        int set = 3 +  2* random.nextInt( 5);
//        System.out.println(set);

//        c) 6, 10, 14, 18, 22.
        int set = 6 +  4* random.nextInt( 5);
        System.out.println(set);
    }
}

