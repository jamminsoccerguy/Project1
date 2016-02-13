package project1;

/**
 * Created by Mike Plucker
 * Date: 2/12/2016
 * Class: CSCI 1933-12
 */

/**
 * Project 1: Part 1: Roman Numerals
 */
public class RomanNumeral {

    //instance variables
    private final int ROMANNUMERAL;
    private int badInteger = 0;

    //class variable
    private static final int UNDEFINED = -100;


    //arrays that allow the toString() method to generate the Roman numeral representation of the integer
    //each ARABIC index corresponds with the same LETTERS index
    private static final int[] ARABIC = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] LETTERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    //constructor
    public RomanNumeral(int integerValue){

        if(integerValue < 1 || integerValue > 2500){ //validate if integer is in acceptable range (1-2500 inclusive)
            badInteger = integerValue;
            ROMANNUMERAL = UNDEFINED;
        }
        else{
            ROMANNUMERAL = integerValue;
        }
    } //end RomanNumeral


    //returns the integer representation of the Roman numeral object
    public int toInt(){
        return ROMANNUMERAL;
    } //end toInt


    //compares two Roman numerals
    public int compareTo(RomanNumeral r){

        //local variable
        int num = 0;

        //r.toInt() converts the Roman numeral object to an integer to compare against
        if(ROMANNUMERAL < r.toInt()){ //if less than
            num = -1;
        }
        else if(ROMANNUMERAL == r.toInt()){ //if equal to
            num = 0;
        }
        else if(ROMANNUMERAL > r.toInt()){ //if greater than
            num = 1;
        }

        return num;
    } //end compareTo


    //returns the Roman numeral representation of the integerValue
    public String toString(){

        //local variables
        String roman = ""; //variable for the Roman numeral
        int num = ROMANNUMERAL; //holds the part of the integer that still has to be converted to a Roman numeral

        if(ROMANNUMERAL == UNDEFINED){ //prints out an error message if an undefined integer is input
            roman = "Undefined: The Integer (" + badInteger + ") is Outside of Acceptable Range";
        }
        else{
            for(int i = 0; i < ARABIC.length; i++){ //iterates over ARABIC array
                while(num >= ARABIC[i]){ //if num is >= to that index of ARABIC (ex. num = 950...it is greater than ARABIC(1) = 900)
                    roman += LETTERS[i]; //adds that index of LETTERS to the string (ex. LETTERS(1) would add "CM" to the string
                    num -= ARABIC[i]; //subtracts that index number of ARABIC from num (ex. ARABIC(1) would subtract 900 from num)
                }
            }
        }
        return roman;
    } //end toString

    //tests methods
    public static void main(String[] args) {

        //creates integer objects to test program
        RomanNumeral r1 = new RomanNumeral(9);
        RomanNumeral r2 = new RomanNumeral(14);
        RomanNumeral r3 = new RomanNumeral(55);
        RomanNumeral r4 = new RomanNumeral(99);
        RomanNumeral r5 = new RomanNumeral(342);
        RomanNumeral r6 = new RomanNumeral(2499);

        //creates minimum and maximum integer object
        RomanNumeral r7 = new RomanNumeral(1);
        RomanNumeral r8 = new RomanNumeral(2500);

        //creates undefined integer objects
        RomanNumeral r9 = new RomanNumeral(0);
        RomanNumeral r10 = new RomanNumeral(2501);
        RomanNumeral r11 = new RomanNumeral(-10);

        //creates more integer objects to test program
        RomanNumeral r12 = new RomanNumeral(4);
        RomanNumeral r13 = new RomanNumeral(5);
        RomanNumeral r14 = new RomanNumeral(10);
        RomanNumeral r15 = new RomanNumeral(50);
        RomanNumeral r16 = new RomanNumeral(66);
        RomanNumeral r17 = new RomanNumeral(100);
        RomanNumeral r18 = new RomanNumeral(199);
        RomanNumeral r19 = new RomanNumeral(500);
        RomanNumeral r20 = new RomanNumeral(1000);


        //displays toInt() and toString() methods of each object
        System.out.println(r1.toInt() + " = " + r1.toString());
        System.out.println(r2.toInt() + " = " + r2.toString());
        System.out.println(r3.toInt() + " = " + r3.toString());
        System.out.println(r4.toInt() + " = " + r4.toString());
        System.out.println(r5.toInt() + " = " + r5.toString());
        System.out.println(r6.toInt() + " = " + r6.toString());
        System.out.println(r7.toInt() + " = " + r7.toString());
        System.out.println(r8.toInt() + " = " + r8.toString());

        //tests toInt() and toString() methods with undefined integers (should return undefined error messages)
        System.out.println(r9.toInt() + " = " + r9.toString());
        System.out.println(r10.toInt() + " = " + r10.toString());
        System.out.println(r11.toInt() + " = " + r11.toString());

        //displays toInt() and toString() methods of each object
        System.out.println(r12.toInt() + " = " + r12.toString());
        System.out.println(r13.toInt() + " = " + r13.toString());
        System.out.println(r14.toInt() + " = " + r14.toString());
        System.out.println(r15.toInt() + " = " + r15.toString());
        System.out.println(r16.toInt() + " = " + r16.toString());
        System.out.println(r17.toInt() + " = " + r17.toString());
        System.out.println(r18.toInt() + " = " + r18.toString());
        System.out.println(r19.toInt() + " = " + r19.toString());
        System.out.println(r20.toInt() + " = " + r20.toString());

        //tests compareTo() method
        System.out.println(r1.compareTo(r2)); //should be -1
        System.out.println(r2.compareTo(r1)); //should be 1
        System.out.println(r1.compareTo(r1)); //should be 0
    } //end main
} //end class
