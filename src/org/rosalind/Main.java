package org.rosalind;

import java.util.*;

public class Main {

    static final int LIMIT = 1000;
    static final List<Integer> listOfPrimeNumbers = createListOfAllPrimeNumbers(LIMIT);

    //erzeuge Liste von allen Primzahlen
    private static List<Integer> createListOfAllPrimeNumbers(int limit) {
        List<Integer> tempList = new ArrayList<>();

        for (int i = 2; i < limit; i++) {
            if (isPrime(i)){
                tempList.add(i);
                System.out.println(i);
            }
        }
        return tempList;
    }

    public static void main(String[] args) {
        System.out.println("Printing all Giuga numbers:");

        //Für alle Zahlen n zwischen 1 und 5000 prüfe, ob Giuga-Zahl; wenn ja, print
        for (int n = 1; n < LIMIT; n++) {
            boolean isGiuga = !isPrime(n) && checkIfNisGiuga(n);
            //wenn Giuga, print
            if (isGiuga){
                System.out.println(n);
            }
        }

    }

    public static boolean checkIfNisGiuga(int n) {
        //erzeuge Liste mit Primfaktoren von n
        List<Integer> primFactorsOfN = new ArrayList<>();

        for (Integer primNumber: listOfPrimeNumbers){
            if (isFactorOf(primNumber,n)){
                primFactorsOfN.add(primNumber);
            }
        }

        //prüfe Giuga-Formel für n

        boolean isGiuga = true;
        for (Integer primFactor: primFactorsOfN){
            boolean isDividable = ( n / primFactor - 1) % primFactor == 0;
            if (!isDividable ){
                isGiuga = false;
            }
        }
        return isGiuga;
    }

    private static boolean isFactorOf(Integer primNumber, int n) {
        return (n % primNumber) == 0;
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
