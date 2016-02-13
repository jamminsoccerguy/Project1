package project1;

/**
 * Created by Mike Plucker
 * Date: 2/12/2016
 * Class: CSCI 1933-12
 */

/**
 * Project 1: Part 3: Number with Least Common Multiple
 */
public class LCM {

    //instance variable
    private final int NUM;


    //constructor
    public LCM(int num){

        //validate that the integer is positive
        if(num < 0){
            throw new IllegalArgumentException("Error: Integer must be positive.");
            //System.out.println("Error: Integer Must be Positive");
        }
        this.NUM = num;
    }


    //finds the least common multiple of num
    public int getLCM(int n){

        //local variables
        int max, min, multiple, lcm = 1;

        //finds the max and min numbers
        if(NUM > n){
            max = NUM;
            min = n;
        }
        else{
            max = n;
            min = NUM;
        }

        //iterates from 1 to the min number
        for(int i = 1; i <= min; i++){
            multiple = (max * i); //finds multiples of the max number
            if(multiple % min == 0){ //checks if multiple is divisible by min
                lcm = multiple; // =first multiple of max that is divisible by min
                break; //break loop
            }
        }
        return lcm;
    }


    //finds the greatest common divisor of num
    public int getGCD(int n){

        //local variable
        int number = NUM;

        if(number == 0){
            return n;
        }

        //Euclid's Algorithm
        while(n != 0){
            if(number > n){
                number -= n;
            }
            else{
                n -= number;
            }
        }
        return number;
    }


    //finds the ratio between the least common multiple & greatest common divisor of num
    public int getRatio(int n){
        return (getLCM(n) / getGCD(n));
    }


    //test methods
    public static void main(String[] args) {

        //create object
        LCM lcm = new LCM(6);

        //test examples from project assignment
        System.out.println(lcm.getLCM(4)); // =12
        System.out.println(lcm.getGCD(4)); // =2
        System.out.println(lcm.getRatio(4)); // =6
    }
}
