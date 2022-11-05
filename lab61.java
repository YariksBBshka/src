import java.util.Scanner;

public class lab61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameofbook = sc.nextLine().toLowerCase();
        int numofcheckedbooks = sc.nextInt();
        if (numofcheckedbooks > 0) {
            int count = 0;
            while (count <= numofcheckedbooks) {
                String bookincatalog = sc.nextLine().toLowerCase();
                if (nameofbook.equals(bookincatalog)) {
                    System.out.printf("You checked %d book(s) and found: %s", count, nameofbook);
                    return;
                }
                count++;
            }
            System.out.printf("The book you search is not here! You checked %d book(s)", numofcheckedbooks);
        } else {
            System.out.println("PLEASE, ENTER THE NUMBER OF BOOKS YOU WANT TO CHECK");
        }
    }
}