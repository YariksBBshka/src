import java.util.Locale;
import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextInt()/1000.0;
        double length = sc.nextInt()/1000.0;
        double height = sc.nextInt()/1000.0;
        System.out.printf(Locale.ENGLISH, "%.1f", (width * length * height));
        }
    }
