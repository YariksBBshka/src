import java.util.Scanner;

public class lab72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(area(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }
    static int area(int x1, int y1, int x2, int y2){
        int length = Math.abs(x2-x1);
        int width = Math.abs(y2 - y1);
        int a = width * length;
        return a;
    }
}

