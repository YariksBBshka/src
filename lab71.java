import java.util.Scanner;

public class lab71 {
    static void isPalindrome(String s) {
    if (s.length() > 0) {
        String s1 = new StringBuilder(s).reverse().toString();
        if (s.equalsIgnoreCase(s1)) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isPalindrome(sc.nextLine().replaceAll(" ", ""));
    }


}
