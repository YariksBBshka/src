import java.util.Scanner;

public class lab91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        String[] arrayofnum = sc.nextLine().split(" ");
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(arrayofnum[i * m + j]);
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
                if (j == m - 1){
                    System.out.printf(String.valueOf(matrix[i][j]));
                }
                else {
                    System.out.printf(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println(max);
    }
}