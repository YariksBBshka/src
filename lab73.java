import java.util.Scanner;

public class lab73 {
    public static int min(int num1,int num2){
        return Math.min(num1,num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(min(min(sc.nextInt(), sc.nextInt()), min(sc.nextInt(), sc.nextInt())));
    }
}
