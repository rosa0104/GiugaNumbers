package com.company;

import java.util.ArrayList;

public class Main {


    ArrayList<Integer>listOfPrimeNumbers= new ArrayList<>();

    for(int i = 0, i<n, i++){
    if (isPrime && istTeilervon(i, n)){
        ListOfPrimeNumbers.add(i);}
    }

    public static void main(String[] args) {
        int count = 0;

        for (int n = 0; n<5000; n++) {
            for (int i = 2; i < 1000; i++) {
                if (isPrime(i)) {
                    count++;
                    ListofPrimenumber.add(i);
                }

            }
        }
        System.out.printf("Found %d primes.\n", count);
    }

    // checks if number is a prime
    private static boolean isPrime(int number) {
        int bigSum = 0;
        for (int k = 1; k <= number - 1; k++) {
            bigSum = (bigSum + calcPowMod(k, number - 1, number)) % number;
        }
        return bigSum % number == number - 1;
    }

    // calculates (a^b)%mod, making sure that intermediate results are always < max(a^2,mod)
    private static int calcPowMod(int a, int b, int mod) {
        int pow = 1;
        for (int k = 1; k <= b; k++) {
            pow = (pow * a) % mod;
        }
        return pow;
    }


}
