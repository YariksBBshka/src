import java.util.Locale;
import java.util.Scanner;

public class lab41 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine().toLowerCase();
        if (model.equals("square")){
            int ss = sc.nextInt();
            if (ss>0){
                System.out.println(ss*ss);
            }
            else{
                System.out.println("ERROR");
            }
        }
        else if (model.equals("rectangle")){
            double recside1 = sc.nextDouble();
            double recside2 = sc.nextDouble();
            if ((recside2>0)&&(recside1>0)){
                System.out.printf("%.3f", recside1*recside2);
            }
            else{
                System.out.println("ERROR");
            }
        }
        else if (model.equals("circle")){
            double cradius = sc.nextDouble();
            if (cradius>0){
                System.out.printf("%.3f", Math.PI*cradius*cradius);
            }
            else{
                System.out.println("ERROR");
            }
        }
        else if (model.equals("triangle")){
            double height = sc.nextDouble();
            double trside = sc.nextDouble();
            if ((height>0)&&(trside>0)){
                System.out.printf("%.3f", (height*trside) * 0.5);
            }
            else{
                System.out.println("ERROR");
            }
        }
    }
}
