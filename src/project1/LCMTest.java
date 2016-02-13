package project1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mike Plucker
 * Date: 2/12/2016
 * Class: CSCI 1933-12
 */
public class LCMTest {

    @Test
    public void testGetLCM() {
        LCM test1 = new LCM(1);
        LCM test2 = new LCM(3);
        LCM test3 = new LCM(5);
        int expectedTest11 = 7;
        int expectedTest12 = 9;
        int expectedTest13 = 11;
        int expectedTest21 = 21;
        int expectedTest22 = 9;
        int expectedTest23 = 33;
        int expectedTest31 = 35;
        int expectedTest32 = 45;
        int expectedTest33 = 55;
        int actualTest11 = test1.getLCM(7);
        int actualTest12 = test1.getLCM(9);
        int actualTest13 = test1.getLCM(11);
        int actualTest21 = test2.getLCM(7);
        int actualTest22 = test2.getLCM(9);
        int actualTest23 = test2.getLCM(11);
        int actualTest31 = test3.getLCM(7);
        int actualTest32 = test3.getLCM(9);
        int actualTest33 = test3.getLCM(11);
        assertEquals(actualTest11, expectedTest11);
        assertEquals(actualTest12, expectedTest12);
        assertEquals(actualTest13, expectedTest13);
        assertEquals(actualTest21, expectedTest21);
        assertEquals(actualTest22, expectedTest22);
        assertEquals(actualTest23, expectedTest23);
        assertEquals(actualTest31, expectedTest31);
        assertEquals(actualTest32, expectedTest32);
        assertEquals(actualTest33, expectedTest33);
    }

    @Test
    public void testGetGCD() {
        LCM test1 = new LCM(1);
        LCM test2 = new LCM(3);
        LCM test3 = new LCM(5);
        int expectedTest11 = 1;
        int expectedTest12 = 1;
        int expectedTest13 = 1;
        int expectedTest21 = 1;
        int expectedTest22 = 3;
        int expectedTest23 = 1;
        int expectedTest31 = 1;
        int expectedTest32 = 1;
        int expectedTest33 = 1;
        int actualTest11 = test1.getGCD(7);
        int actualTest12 = test1.getGCD(9);
        int actualTest13 = test1.getGCD(11);
        int actualTest21 = test2.getGCD(7);
        int actualTest22 = test2.getGCD(9);
        int actualTest23 = test2.getGCD(11);
        int actualTest31 = test3.getGCD(7);
        int actualTest32 = test3.getGCD(9);
        int actualTest33 = test3.getGCD(11);
        assertEquals(actualTest11, expectedTest11);
        assertEquals(actualTest12, expectedTest12);
        assertEquals(actualTest13, expectedTest13);
        assertEquals(actualTest21, expectedTest21);
        assertEquals(actualTest22, expectedTest22);
        assertEquals(actualTest23, expectedTest23);
        assertEquals(actualTest31, expectedTest31);
        assertEquals(actualTest32, expectedTest32);
        assertEquals(actualTest33, expectedTest33);
    }

    @Test
    public void testGetRatio() {
        LCM test1 = new LCM(1);
        LCM test2 = new LCM(3);
        LCM test3 = new LCM(5);
        int expectedTest11 = 7;
        int expectedTest12 = 9;
        int expectedTest13 = 11;
        int expectedTest21 = 21;
        int expectedTest22 = 3;
        int expectedTest23 = 33;
        int expectedTest31 = 35;
        int expectedTest32 = 45;
        int expectedTest33 = 55;
        int actualTest11 = test1.getRatio(7);
        int actualTest12 = test1.getRatio(9);
        int actualTest13 = test1.getRatio(11);
        int actualTest21 = test2.getRatio(7);
        int actualTest22 = test2.getRatio(9);
        int actualTest23 = test2.getRatio(11);
        int actualTest31 = test3.getRatio(7);
        int actualTest32 = test3.getRatio(9);
        int actualTest33 = test3.getRatio(11);
        assertEquals(actualTest11, expectedTest11);
        assertEquals(actualTest12, expectedTest12);
        assertEquals(actualTest13, expectedTest13);
        assertEquals(actualTest21, expectedTest21);
        assertEquals(actualTest22, expectedTest22);
        assertEquals(actualTest23, expectedTest23);
        assertEquals(actualTest31, expectedTest31);
        assertEquals(actualTest32, expectedTest32);
        assertEquals(actualTest33, expectedTest33);
    }
}