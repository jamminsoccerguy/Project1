package project1;

/**
 * Created by Mike Plucker
 * Date: 2/12/2016
 * Class: CSCI 1933-12
 */
public class PrimeTest {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {

        //create objects
        Prime p = new Prime();
        Prime p2 = new Prime();

        //test examples from project assignment
        System.out.println(p.getPrime()); //should be 2
        System.out.println(p2.getPrime()); //should be 3
        System.out.println(Prime.getPrime()); //should be 5
        p.reset();
        System.out.println(p2.getPrime()); //should be 2
        System.out.println(p2.sumPrimes(4)); //should be 26
        System.out.println(p2.getPrime()); //should be 13
        System.out.println(p.getPrime()); //should be 17

        System.out.println();

        //test reset() and a bunch of primes
        p2.reset();
        System.out.println(Prime.getPrime());
        System.out.println(p.getPrime());
        System.out.println(p2.getPrime());
        System.out.println(Prime.getPrime());
        System.out.println(p.getPrime());
        System.out.println(p2.getPrime());
        System.out.println(Prime.getPrime());
        System.out.println(p.getPrime());
        System.out.println(p2.getPrime());
        System.out.println(Prime.getPrime());
        System.out.println(p.getPrime());
        System.out.println(p2.getPrime());

        System.out.println();

        //tests sumPrimes()
        Prime.reset();
        System.out.println(Prime.getPrime());
        System.out.println(Prime.getPrime());
        System.out.println(Prime.sumPrimes(4));
        System.out.println(Prime.getPrime());
        System.out.println(Prime.getPrime());
        System.out.println(Prime.sumPrimes(2));
        System.out.println(Prime.getPrime());
        System.out.println(Prime.getPrime());

        System.out.println();

        //tests reset(int n)
        Prime.reset(4);
        System.out.println(Prime.getPrime());
        Prime.reset(5);
        System.out.println(Prime.getPrime());

        System.out.println();

        Prime.reset(20);
        System.out.println(Prime.getPrime());
        Prime.reset(22);
        System.out.println(Prime.getPrime());
    }
}
