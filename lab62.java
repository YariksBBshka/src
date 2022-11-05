import java.util.Scanner;

public class lab62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 1) {
            int count = 1;
            int maxdif = Integer.MIN_VALUE;
            int firstnum = sc.nextInt();
            int secondnum = sc.nextInt();
            int sumofpair = firstnum + secondnum;
            while (count < n) {
                firstnum = sc.nextInt();
                secondnum = sc.nextInt();
                int sumofpair2 = firstnum + secondnum;
                int dif = Math.abs(sumofpair2 - sumofpair);
                if (dif > maxdif) {
                    maxdif = dif;
                }
                count++;
            }
            if (maxdif == 0) {
                System.out.printf("Yes, value = %d", sumofpair);
            } else {
                System.out.printf("No, maxdiff = %d", maxdif);
            }
        } else {
            System.out.println("ENTER NUMBER OF PAIRS MORE THAN ONE");
        }
    }
}