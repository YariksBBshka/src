import java.util.Scanner;

public class lab64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int pnsum = 0;
        int npnsum = 0;
        while (true) {
            String command = sc.nextLine().toLowerCase();
            if (command.equals("stop")) {
                System.out.println("Sum of all prime numbers is: " + pnsum);
                System.out.println("Sum of all non-prime numbers is: " + npnsum);
                break;
            }
            int enterednum = Integer.parseInt(command);
            if (enterednum <= 0) {
                System.out.println("Number is negative or zero");
            } else if (enterednum == 1) {
                pnsum++;
            } else {
                for (int del = 1; del < 1228767822; del++) {
                    if (enterednum % del == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    pnsum = pnsum + enterednum;
                } else if (count > 2) {
                    npnsum = npnsum + enterednum;
                }
                count = 0;
            }
        }
    }
}