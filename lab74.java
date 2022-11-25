import java.util.Scanner;

public class lab74 {

    static double factorial(double n) {
        double result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n-1);
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double k = sc.nextDouble();
        if((n<=0) || (k<=0)){
            System.out.println("ERROR");
            return;
        }
        double sochi = factorial(n) / factorial(n-k);
        double sochi2 = sochi / factorial(k);
        int sochi3 = (int) Math.ceil(sochi2);
        System.out.println(sochi3);
    }
}