import java.util.Arrays;
import java.util.Scanner;

public class lab81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] vagon = new int[Integer.parseInt(sc.nextLine())];
        int piev = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < vagon.length; i++) {
            int leftplaces = Integer.parseInt(sc.nextLine());
            vagon[i] = piev - leftplaces;
        }
        for (int i = 0; i < vagon.length; i++) {
            sum = sum + vagon[i];
        }
        String s = "";
        for (int k = 0; k < vagon.length; k++) {
            if (k == vagon.length - 1) {
                s = s + vagon[k];
            } else {
                s = s + vagon[k] + " ";
            }
        }
        System.out.println(s);
        System.out.println(sum);
    }
}