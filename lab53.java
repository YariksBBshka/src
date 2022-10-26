import java.util.Scanner;

public class lab53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            if ((num>=-500 && num<=500) || (num>=1000 && num<=1500)){
                System.out.printf("Correct number is: %d", num);
                break;
            }
            else{
                System.out.println("Not yet");
            }
        }
    }
}
