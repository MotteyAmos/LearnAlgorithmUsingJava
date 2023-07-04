import java.util.Scanner;

public class Gcd{
    public static double Gcd(double num1, double num2){
        if (num2 == 0){
            return num1;
        }else{
            return Gcd(num2, num1 % num2);
        }
    }

    public  static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("The GCD of " +num1 + " and " + num2 + " is " + Gcd(num1,num2));
    }
}
