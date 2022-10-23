import java.util.Scanner;

public class lab4v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int beginindex = sc.nextInt();
        int endindex = sc.nextInt();
        System.out.println(str.substring(++beginindex, endindex));

    }
}
