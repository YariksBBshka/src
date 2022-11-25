import java.util.Scanner;

public class lab92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int datanum = Integer.parseInt(sc.nextLine());
        int pas = 0;
        int [][] arrayofdata = new int[datanum][4];
        int count = 0;
        int count2 = 0;
        while(count<datanum){
            String values = sc.nextLine();
            String [] dfw = values.split(" ");
            for(int j = 0; j<4; j++){
                arrayofdata[count][j] = Integer.parseInt(dfw[j]);
            }
            count++;
        }
        int train = Integer.parseInt(sc.nextLine());
        for(int a = 0; a<datanum;a++){
            if (arrayofdata[a][0] == train){
                pas += arrayofdata[a][3];
                count2++;
            }
        }
        if (count2 == 0){
            System.out.println("ERROR");
        }
        else{
            System.out.println(pas);
        }
    }
}
