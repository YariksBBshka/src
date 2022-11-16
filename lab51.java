import java.util.Scanner;

public class lab51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int count = 1;
            int maximun = Integer.MIN_VALUE;
            while (count <= n) {
                int im = sc.nextInt();
                if (im > maximun){
                    maximun = im;
                }
                count = count + 1;
            }
            System.out.println(maximun);
        }
        else{
            System.out.println("ERROR");
        }
    }
}