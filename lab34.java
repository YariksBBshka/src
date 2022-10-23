import java.util.Scanner;

public class lab34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double meters = sc.nextDouble();
        
        meters = meters * 100;
        if ((meters / 30.48) <= 15){
            System.out.println("10");
        }
        else if ((meters / 30.48) <= 25){
            System.out.println("20");
        }
        else if ((meters / 30.48) <= 35){
            System.out.println("30");
        }
        else if ((meters / 30.48) > 35){
            System.out.println("40");
        }
    }
}
