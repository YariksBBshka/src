import java.util.Scanner;

public class lab54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int c = a ; c<=b; c +=3){
            System.out.println(c);
        }
    }
}
