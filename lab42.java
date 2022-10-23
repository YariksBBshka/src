import java.util.Locale;
import java.util.Scanner;

public class lab42 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);
        String opertaion = sc.nextLine();
        if (opertaion.equals("+")) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res = a+b;
            System.out.printf("%d + %d = %d", a, b, res);
        } else if (opertaion.equals("-")) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res = a-b;
            System.out.printf("%d - %d = %d", a, b, res);
        } else if (opertaion.equals("x")) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res = a*b;
            System.out.printf("%d * %d = %d", a, b, res);
        } else if (opertaion.equals("/")) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double res = a/b;
            if (b == 0){
                System.out.println("Division by zero");
            }
            else{
                System.out.printf("%.0f / %.0f = %.3f", a, b, res);
            }
        } else if (opertaion.equals("^")) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double res = Math.pow(a, b);
            System.out.printf("%.1f ^ %.1f = %.3f", a, b, res);
        }
        else{
            System.out.println("WRONG OPERATION");
        }
    }
}
