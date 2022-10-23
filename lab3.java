import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char symbol = str.charAt(0);
        String str2 = sc.nextLine();
        char symbol2 = str2.charAt(0);
        int a = symbol;
        int b = symbol2;
        System.out.println(Math.abs(a+b));
        System.out.println(Math.abs(symbol2+symbol));
        System.out.println((char) (symbol2+symbol));
    }
}
