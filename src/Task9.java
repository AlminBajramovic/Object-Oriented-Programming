import java.util.Scanner;
public class Task9 {
    static void drawNumberPiramid(){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawNumberPiramid();
    }
}