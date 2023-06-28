import java.util.ArrayList;
import java.util.Arrays;

public class _Math {

    public static void main(String[] arg){
        //gcd test
        _Math result1 = new _Math();
       // System.out.println(result1.gcd(10,4));

        //prime test
        result1.primes_of(81);

    }

    public int gcd(int a, int b){
        while (b != 0){
            int temp = a;
            a = b;
            b = temp % a;
        }
        return a;
    }

    private  boolean isPrime(int num){

        for (int i=2; i<= num /2; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    public void primes_of(int num){
        ArrayList<Integer> thePrimes = new ArrayList<Integer>();
        for (int i=2; i<= num; i++){
            if (isPrime(i) == true){
                thePrimes.add(i);
            }
        }

        System.out.println(thePrimes);
            }
}
