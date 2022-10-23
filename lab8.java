import java.util.Locale;
import java.util.Scanner;

public class lab8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);
        double width = 2.94;
        double length = 12.692;
        double height = 2.425;
        double volume = width * length * height;
        double price = sc.nextDouble();
        double density = 227;
        System.out.printf("%.2f", (density * volume * price) * 0.97);
    }
}
