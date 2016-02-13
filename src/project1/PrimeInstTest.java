package project1;

/**
 * Created by Mike Plucker
 * Date: 2/12/2016
 * Class: CSCI 1933-12
 */
public class PrimeInstTest {

    public static void main(String[] args) {

        //create objects
        PrimeInst p = new PrimeInst();
        PrimeInst p2 = new PrimeInst();

        //test examples from project assignment
        System.out.println(p.getPrime()); //should be 2
        System.out.println(p2.getPrime()); //should be 2
        p.reset();
        System.out.println(p2.getPrime()); //should be 3
        System.out.println(p2.sumPrimes(4)); //should be 36
        System.out.println(p2.getPrime()); //should be 17
        System.out.println(p.getPrime()); //should be 2
    }
}
