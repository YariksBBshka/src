import java.util.Scanner;

public class lab52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int count = 1;
            int minimum = Integer.MAX_VALUE;
            while (count <= n) {
                int im = sc.nextInt();
                if (im < minimum){
                    minimum = im;
                }
                count = count + 1;
            }
            System.out.println(minimum);
        }
        else{
            System.out.println("ERROR");
        }
    }
}
