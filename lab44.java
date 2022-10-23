import java.util.Locale;
import java.util.Scanner;

public class lab44 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine().toLowerCase();
        String dotw = sc.nextLine().toLowerCase();
        double kg = sc.nextDouble();
        if (kg>0){
            if ((dotw.equals("monday"))||(dotw.equals("tuesday"))||(dotw.equals("wednesday"))||(dotw.equals("thursday"))||(dotw.equals("friday"))){
                switch (fruit) {
                    case "banana":
                        System.out.printf("%.2f", (2.50 * kg));
                        break;
                    case "apple":
                        System.out.printf("%.2f", (1.20 * kg));
                        break;
                    case "orange":
                        System.out.printf("%.2f", (0.85 * kg));
                        break;
                    case "grape fruit":
                        System.out.printf("%.2f", (1.45 * kg));
                        break;
                    case "kiwi":
                        System.out.printf("%.2f", (2.70 * kg));
                        break;
                    case "pineapple":
                        System.out.printf("%.2f", (5.50 * kg));
                        break;
                    case "grapes":
                        System.out.printf("%.2f", (3.85 * kg));
                        break;
                    default:
                        System.out.println("ERROR");
                }
            }
            else if ((dotw.equals("sunday"))||(dotw.equals("saturday"))){
                switch (fruit) {
                    case "banana":
                        System.out.printf("%.2f", (2.70 * kg));
                        break;
                    case "apple":
                        System.out.printf("%.2f", (1.25 * kg));
                        break;
                    case "orange":
                        System.out.printf("%.2f", (0.90 * kg));
                        break;
                    case "grape fruit":
                        System.out.printf("%.2f", (1.60 * kg));
                        break;
                    case "kiwi":
                        System.out.printf("%.2f", (3.00 * kg));
                        break;
                    case "pineapple":
                        System.out.printf("%.2f", (5.60 * kg));
                        break;
                    case "grapes":
                        System.out.printf("%.2f", (4.20 * kg));
                        break;
                    default:
                        System.out.println("ERROR");
                }
            }
            else{
                System.out.println("ERROR");
            }
        }
        else{
            System.out.println("ERROR");
        }
    }
}

