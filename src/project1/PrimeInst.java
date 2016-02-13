package project1;

/**
 * Created by Mike Plucker
 * Date: 2/12/2016
 * Class: CSCI 1933-12
 */

/**
 * Project 1: Part 2: Primes step 3
 */
public class PrimeInst {

    //instance variable
    private int prime = 0;


    //check if integer is a prime number (returns true if a prime number, false if not a prime number)
    public boolean isPrime(int p){

        //Negative numbers, 0 and 1 are not prime
        if(p < 2){
            return false;
        }

        //2 and 3 are prime
        if(p == 2 || p == 3){
            return true;
        }

        //check if p is a multiple of 2 (even numbers aren't prime..except 2)
        if(p % 2 == 0){
            return false;
        }

        //checks odd numbers
        int sqrt = (int)Math.sqrt(p);
        for(int i = 3; i <= sqrt; i += 2){
            if(p % i == 0){
                return false;
            }
        }
        return true;
    }


    //returns the next prime number in order
    public int getPrime(){

        //local variable
        int newPrime = 0;

        while(!isPrime(prime)){ //increments until prime number is found
            prime++; //increment
            newPrime = prime;
        }
        newPrime = prime; //get current integer if it's prime
        prime++; //increment so that the next time method is called it will find the next prime in order

        return newPrime;
    }


    //resets the next prime to 2
    public void reset(){
        prime = 2;
    }


    //sets the next prime to be the smallest prime, p, where p >= n
    public void reset(int n){
        prime = n;
    }


    //sums the next n primes (getPrime keeps incrementing)
    public int sumPrimes(int n){

        //local variable
        int sum = 0;

        //iterates through all primes between current prime and n
        for(int i = 0; i < n; i++){
            sum += getPrime(); //adds prime to sum
        }

        return sum;
    }
}
