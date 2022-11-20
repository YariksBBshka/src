import java.util.Scanner;

public class lab72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
    static void area(int x1, int y1, int x2, int y2){
        int length = Math.abs(x2-x1);
        int width = Math.abs(y2 - y1);
        System.out.println(length*width);

    }
}

