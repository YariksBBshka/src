import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rccount = sc.nextInt();
        int lococount = 2;
        double rclength = 13.92; // from mm in meters
        double locolength = 21.70; // from mm in meters
        System.out.println(Math.round(rccount * rclength + lococount * locolength));

    }
}
