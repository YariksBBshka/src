import java.util.Arrays;
import java.util.Scanner;

public class lab82 {
    public static void main(String[] args) {
        //сравнивает относительно первой строки
        Scanner sc = new Scanner(System.in);
        String finals = null;
        String s1 = sc.nextLine().replaceAll("\\s+", ",");
        String[] firstfrase = s1.split(",");
        String s2 = sc.nextLine().replaceAll("\\s+", ",");
        String[] secondfrase = s2.split(",");
        for (int i = 0; i < firstfrase.length; i++) {
            for (int j = 0; j < secondfrase.length; j++) {
                if (firstfrase[i].equalsIgnoreCase(secondfrase[j])) {
                    finals += " " + secondfrase[j];
                    break;
                }
            }
        }
        String[] finalsarray = Arrays.copyOfRange(finals.split(" "), 1, finals.split(" ").length);
        String s = "";
        for (int k = 0; k < finalsarray.length; k++) {
            if (k == finalsarray.length - 1) {
                s = s + finalsarray[k];
            } else {
                s = s + finalsarray[k] + " ";
            }
        }
        System.out.println(s);
    }
}