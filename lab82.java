import java.util.Arrays;
import java.util.Scanner;

public class lab82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String finals = null;
        String s1 = sc.nextLine();
        String[] firstfrase = s1.split(" ");
        String s2 = sc.nextLine();
        String[] secondfrase = s2.split(" ");
        for (int i = 0; i < firstfrase.length; i++) {
            for (int j = 0; j < secondfrase.length; j++) {
                if (firstfrase[i].equalsIgnoreCase(secondfrase[j])) {
                    finals += " " + secondfrase[j];
                    break;
                }
            }
        }
        String[] finalsarray = Arrays.copyOfRange(finals.split(" "), 1, finals.split(" ").length);
        System.out.println(Arrays.toString(finalsarray));
    }
}
// АЛЕКСАНДР ИГОРЕВИЧ, ПОМОГИТЕ!!!!!!!!!!!!