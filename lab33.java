import java.util.Scanner;

public class lab33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double speed = sc.nextDouble();
        if (speed>=0) {
        if ((speed>=0)&&(speed<=40)){
            System.out.println("Слишком медленно");
        }
        else if ((speed>40)&&(speed<=80)){
            System.out.println("Медленно");
        }
        else if ((speed>80)&&(speed<=120)) {
            System.out.println("Оптимально");
        }
        else if (speed>120) {
            System.out.println("Слишком быстро");
        }
        }
        else {
            System.out.println("ERROR");
        }
    }
}
