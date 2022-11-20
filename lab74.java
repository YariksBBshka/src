import javax.swing.*;
import java.util.Scanner;

public class lab74 {
    public static long factorial(long num){
        if (num < 0){
            System.out.println("ERROR");
            return 0;
        }
        if (num <= 1){
            return 1;
        }
        return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long sochi = factorial(n) / factorial(k);
        long sochi2 = sochi / factorial(n - k);
        System.out.println(sochi2);
    }
}
