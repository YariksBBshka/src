import java.util.Arrays;
import java.util.Scanner;

public class lab83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String values = sc.nextLine();
        String[] valuesint = values.split(" ");
        int[] finalarray = new int[valuesint.length];
        for (int i = 0; i < valuesint.length; i++) {
            finalarray[i] = Integer.parseInt(valuesint[i]);
        }
        int count = 0;
        int numofrotations = sc.nextInt();
        if (numofrotations >= 0) {
            while (count < numofrotations) {
                int lastnum = finalarray[finalarray.length - 1];
                for (int i = finalarray.length - 1; i > 0; i--) {
                    finalarray[i] = finalarray[i - 1];
                }
                finalarray[0] = lastnum;
                count++;
            }
            String s = "";
            for (int k = 0; k < finalarray.length; k++) {
                if (k == finalarray.length - 1) {
                    s = s + finalarray[k];
                } else {
                    s = s + finalarray[k] + " ";
                }
            }
            System.out.println(s);
        }
        else {
            System.out.println("ERROR");
        }
    }
}