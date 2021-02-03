package Chapter6;
/*
6.24 (Perfect Numbers) An integer number is said to be a perfect number if its factors, including
        1 (but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 =
        1 + 2 + 3. Write a method isPerfect that determines whether parameter number is a perfect number.
        Use this method in an application that displays all the perfect numbers between 1 and 1000. Display
        the factors of each perfect number to confirm that the number is indeed perfect. Challenge the com-
        puting power of your computer by testing numbers much larger than 1000. Display the results.
*/
public class PerfectNumbers {

    public String perfect(int value) {
        int factorSum = 1;
        String factors = "1";
        for (int test = 2; test <= value / 2; test++) {
            if (value % test == 0) {
                factorSum += test;
                factors +=   "+"+ test;
            }
        }
        if (factorSum == value)
            return factors;
        return null;
    }


    public void findPerfects() {
        for (int number = 2; number <= 1000; number++) {
            String result = perfect(number);
            if (result != null)
                System.out.printf("%d is perfect.\n\tFactors: %s\n",number, result);
        }
    }


    public static void main( String args[] ) {
        PerfectNumbers application = new PerfectNumbers();
        application.findPerfects();
    }
}
