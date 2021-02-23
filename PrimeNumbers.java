package Chapter6;
//6.25 (Prime Numbers) A positive integer is prime if it’s divisible by only 1 and itself. For example,
//        2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. The number 1, by definition, is not prime.
//        a) Write a method that determines whether a number is prime.
//        b) Use this method in an application that determines and displays all the prime numbers
//        less than 10,000. How many numbers up to 10,000 do you have to test to ensure that
//        you’ve found all the primes?
//        c) Initially, you might think that n/2 is the upper limit for which you must test to see
//        whether a number n is prime, but you need only go as high as the square root of n. Re-
//        write the program, and run it both ways.
public class PrimeNumbers {

    StringBuilder primeNumbers = new StringBuilder();

    public boolean isPrime(int number) {
        for ( int divisor = 2 ; divisor < number ; divisor++ ) {
            if ( number % divisor == 0 ) {
                return false;
            }
        }
        return true;
    }


    public void findPrimeNumbersBetween(int start, int end) {
        System.out.println("prime number(s) between " + start + " and " + end + " is(are): ");
        while (start <= end) {
            if ( isPrime(start) )
//            if ( isPrimeUpperLimit(start))
            {
                primeNumbers.append(start).append(",");
            }
            start++;
        }
        System.out.println(primeNumbers);
    }


    public boolean isPrimeUpperLimit(int number) {
        int highestNumber = (int) Math.sqrt( number );
        for ( int divisor = 2 ; divisor < highestNumber ; divisor++ ) {
            if ( highestNumber % divisor == 0 ) {
                return false;
            }
        }
        return true;
    }
}