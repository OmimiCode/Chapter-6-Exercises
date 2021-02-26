package Chapter6;

public class GreatestCommonDivisor {


    public int modulus(int number1, int number2) {

        if(number1>number2){
            return number1 % number2;
        }else{
            return  number2 % number1;
        }
    }

    public int gcd(int number1, int number2) {
        do {
            int mod = modulus(number1, number2);
            number1 = number2;
            number2 = mod;
        }
        while ( number2 != 0 );
        return number1;
    }

}
