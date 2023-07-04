package DataStructure.out.production.DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {

    public static boolean isPrime(int num){
        for (int i=2; i<=(num/2); i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static ArrayList<Integer> PrimeNumber(int num){
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i=2; i < num; i++){
            if (isPrime(i) == true){
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main (String[] arg){
        long startTime = System.nanoTime();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to print prime numbers upto: ");
        int primeEnd = scanner.nextInt();

        System.out.println(PrimeNumber(primeEnd));

        long duration= (System.nanoTime() - startTime)/1000000;
        System.out.println("The program runs in " + duration + " ms");
    }
}
