import java.util.Scanner;

public class lab84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String s = "";
        String values = sc.nextLine();
        String[] valuesint = values.split(" ");
        int[] finalarray = new int[valuesint.length];
        for (int i = 0; i < valuesint.length; i++) {
            finalarray[i] = Integer.parseInt(valuesint[i]);
        }
        for (int i = 0; i < finalarray.length - 1; i++){
            for (int j = i+1; j < finalarray.length; j++){
                if (finalarray[i]> finalarray[j]){
                    count++;
                }
            }
            if (count == finalarray.length - i - 1){
                s += finalarray[i] + " ";
            }
            count = 0;
        }
        s += finalarray[finalarray.length - 1];
        System.out.println(s);
    }
}
