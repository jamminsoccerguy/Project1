package project1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mike Plucker
 * Date: 2/12/2016
 * Class: CSCI 1933-12
 */
public class PrimeJUnitTest {

    @Test
    public void isPrimeTest() {
        assertEquals(Prime.isPrime(2), true);
        assertEquals(Prime.isPrime(3), true);
        assertEquals(Prime.isPrime(5), true);
        assertEquals(Prime.isPrime(7), true);
        assertEquals(Prime.isPrime(11), true);
        assertEquals(Prime.isPrime(101), true);
        assertEquals(Prime.isPrime(4), false);
    }

    @Test
    public void getPrimeTest() {
        Prime.reset();
        assertEquals(Prime.getPrime(), 2);
        assertEquals(Prime.getPrime(), 3);
        assertEquals(Prime.getPrime(), 5);
        assertEquals(Prime.getPrime(), 7);
    }

    @Test
    public void resetTest() {
        Prime.reset();
        assertEquals(Prime.getPrime(), 2);
        assertEquals(Prime.getPrime(), 3);
        assertEquals(Prime.getPrime(), 5);
        assertEquals(Prime.getPrime(), 7);
    }

    @Test
    public void resetAtNTest() {
        Prime.reset();
        assertEquals(Prime.getPrime(), 2);
        assertEquals(Prime.getPrime(), 3);
        assertEquals(Prime.getPrime(), 5);
        assertEquals(Prime.getPrime(), 7);
        Prime.reset(4);
        assertEquals(Prime.getPrime(), 5);
        assertEquals(Prime.getPrime(), 7);
    }

    @Test
    public void sumPrimesTest() {
        Prime.reset();
        assertEquals(Prime.sumPrimes(4), 17);
    }

    @Test
    public void primeInstTest() {
        PrimeInst instance = new PrimeInst();
        Prime.reset();
        assertEquals(instance.getPrime(), 2);
        assertEquals(instance.getPrime(), 3);
        assertEquals(instance.getPrime(), 5);
        assertEquals(instance.getPrime(), 7);
        assertEquals(Prime.getPrime(), 2);
        assertEquals(Prime.getPrime(), 3);
        assertEquals(Prime.getPrime(), 5);
        assertEquals(instance.getPrime(), 11);
        assertEquals(Prime.getPrime(), 7);
    }
}