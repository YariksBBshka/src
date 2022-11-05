import java.util.Scanner;

public class lab63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;
        int incomesum;
        while (true) {
            String country = sc.nextLine().toLowerCase();
            if (country.equals("end")) {
                break;
            }
            country = Character.toUpperCase(country.charAt(0)) + country.substring(1);
            String req = sc.nextLine().toLowerCase();
            if (req.equals("end")) {
                break;
            }
            int requiredsum = Integer.parseInt(req);
            if (requiredsum < 0) {
                System.out.println("HOW???");
                System.out.println("THAT'S IMPOSSIBLE!");
                break;
            }
            while (balance < requiredsum) {
                String income = sc.nextLine().toLowerCase();
                if (income.equals("end")) {
                    return;
                }
                incomesum = Integer.parseInt(income);
                if (incomesum < 0) {
                    System.out.println("DON'T WASTE MONEY FROM TRAVEL BUDGET");
                }
                balance += incomesum;
            }
            balance -= requiredsum;
            if (balance >= 0) {
                System.out.println("Going to " + country);
            }
        }
    }
}