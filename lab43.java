import java.util.Locale;
import java.util.Scanner;

public class lab43 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);
        String clss = sc.nextLine().toLowerCase();
        int rcc = sc.nextInt();
        int pc = sc.nextInt();
        if ((rcc >= 0) && (pc >= 0)) {
            if (clss.equals("compartment")) {
                System.out.printf("%.2f $", rcc * pc * 12.00);
            } else if (clss.equals("second-class")) {
                System.out.printf("%.2f $", pc * rcc * 7.50);
            } else if (clss.equals("econom-class")) {
                System.out.printf("%.2f $", pc * rcc * 7.50);
            }
            else{
                System.out.println("ERROR");
            }
        }
        else{
            System.out.println("ERROR");
        }
    }
}
