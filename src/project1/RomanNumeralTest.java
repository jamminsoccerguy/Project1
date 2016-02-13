package project1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mike Plucker
 * Date: 2/12/2016
 * Class: CSCI 1933-12
 */
public class RomanNumeralTest {

    @Test
    public void testRomanNumeral() {
        RomanNumeral num = null;
        for (int i = -50; i < 2550; i++) {
            num = new RomanNumeral(i);
            assertNotNull(num);
            num = null;
        }
    }

    @Test
    public void testToString() {
        RomanNumeral num = new RomanNumeral(1);
        assertEquals(num.toString(), "I");
        num = new RomanNumeral(11);
        assertEquals(num.toString(), "XI");
        num = new RomanNumeral(134);
        assertEquals(num.toString(), "CXXXIV");
        num = new RomanNumeral(257);
        assertEquals(num.toString(), "CCLVII");
        num = new RomanNumeral(789);
        assertEquals(num.toString(), "DCCLXXXIX");
        num = new RomanNumeral(1153);
        assertEquals(num.toString(), "MCLIII");
        num = new RomanNumeral(2493);
        assertEquals(num.toString(), "MMCDXCIII");
        num = new RomanNumeral(1294);
        assertEquals(num.toString(), "MCCXCIV");
        num = new RomanNumeral(398);
        assertEquals(num.toString(), "CCCXCVIII");
        num = new RomanNumeral(1888);
        assertEquals(num.toString(), "MDCCCLXXXVIII");
    }

    @Test
    public void testToInt() {
        RomanNumeral num;
        for (int i = 1; i < 2501; i++) {
            num = new RomanNumeral(i);
            assertEquals(num.toInt(), i);
        }
    }

    @Test
    public void testCompareTo() {
        RomanNumeral num1;
        RomanNumeral num2;
        for (int i = 1; i < 2500; i++) {
            num1 = new RomanNumeral(i);
            num2 = new RomanNumeral(i + 1);
            assertEquals(num1.compareTo(num2), -1);
        }
    }
}