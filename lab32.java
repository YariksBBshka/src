import java.util.Scanner;

public class lab32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt(); //taxi-train
        int et = sc.nextInt(); // electric train
        int bus = sc.nextInt();
        if ((tt>=1)&&(tt<=60)&&(et>=1)&&(et<=60)&&(bus>=1)&&(bus<=60)){
            int time = tt + et + bus;
            int hours = time / 60;
            int minutes = time % 60;
            System.out.printf("%d:%02d", hours, minutes);
        }
        else{
            System.out.println("ERROR");
        }
    }
}
