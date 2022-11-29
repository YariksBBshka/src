import java.util.Scanner;

public class lab94 {
    public static void main(String[] args) {
        Scanner sqw = new Scanner(System.in);
        int n = Integer.parseInt(sqw.nextLine());
        if (n > 0) {
            int[][] matr = matrixCreation(n);
            int dett = det(matr);
            if (dett == Integer.MAX_VALUE) System.out.println("error");
            else System.out.println(dett);
        }
        else{
            System.out.println("ERROR");
        }
    }
    public static int[][] matrixCreation(int n){
        Scanner sqw = new Scanner(System.in);
        int[][] firstmatrix = new int[n][n];
        String inputline;
        String[] inputline2;
        for (int i = 0; i < n; i++) {
            inputline = sqw.nextLine();
            inputline2 = inputline.split(" ");
            for  (int j = 0; j < n; j++) {
                firstmatrix[i][j] = Integer.parseInt(inputline2[j]);
            }
        }
        return firstmatrix;
    }
    public static int det(int[][] matr){
        int n = matr.length;
        if (n<=0) return Integer.MAX_VALUE;
        if (n==1) return matr[0][0];
        int dett = 0;
        for (int i=0; i<n; i++){
            int[][] minor = new int[n-1][n-1];
            for (int j=1; j<n; j++) {
                for (int k=0; k<n; k++) {
                    if (k<i) {
                        minor[j-1][k]=matr[j][k];
                    }
                    else if (k>i){
                        minor[j-1][k-1]=matr[j][k];
                    }
                }
            }
            dett+=(matr[0][i])*Math.pow(-1,i)*det(minor);
        }
        return dett;
    }
}
