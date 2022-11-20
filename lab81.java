import java.util.Arrays;
import java.util.Scanner;

public class lab81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] vagon = new int[sc.nextInt()];
        int piev = sc.nextInt();
        for (int i = 0; i < vagon.length; i++) {
            int lestplaces = sc.nextInt();
            vagon[i] = piev - lestplaces;
        }
        for (int i = 0; i < vagon.length; i++) {
            sum = sum + vagon[i];
        }
        System.out.println(Arrays.toString(vagon));
        System.out.println(sum);
    }
}

