import java.util.Arrays;
import java.util.Scanner;

public class lab81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int data = Integer.parseInt(sc.nextLine());
        if (data > 0) {
            int[] vagon = new int[data];
            int piev = Integer.parseInt(sc.nextLine().replaceAll(" ", ""));
            for (int i = 0; i < vagon.length; i++) {
                int leftplaces = Integer.parseInt(sc.nextLine().replaceAll(" ", ""));
                if (leftplaces < 0){
                    System.out.println("ERROR");
                    System.exit(0);
                }
                vagon[i] = piev - leftplaces;
                if (vagon[i] < 0){
                    System.out.println("ERROR");
                    System.exit(0);
                }
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
        else {
            System.out.println("ERROR");
        }
    }
}