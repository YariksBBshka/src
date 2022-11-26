import java.util.Scanner;

public class lab93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int datanum = Integer.parseInt(sc.nextLine());
        int[][] arrayofdata = new int[datanum][datanum];
        int count = 0;
        int count2 = 0;
        while (count < datanum) {
            String values = sc.nextLine();
            String[] dfw = values.split(" ");
            for (int j = 0; j < datanum; j++) {
                arrayofdata[count][j] = Integer.parseInt(dfw[j]);
            }
            count++;
        }
        for (int i = 0; i < datanum; i++) {
            for (int j = 0; j < datanum; j++) {
                if (i + j == datanum - 1) {
                    break;
                }
                arrayofdata[datanum - 1 - i][datanum - 1 - j] = arrayofdata[i][j];
            }
        }
        for (int i = 0; i < datanum; i++) {
            for (int j = 0; j < datanum; j++) {
                System.out.printf(arrayofdata[i][j] + "\t");
            }
            System.out.println();
        }
    }
}