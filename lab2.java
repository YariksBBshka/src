import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String example = sc.nextLine().toUpperCase().replaceAll(" ", "");
        System.out.println(example);
    }
}
