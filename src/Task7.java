import java.util.Scanner;
public class Task7 {
    static void drawStarsPiramid(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int rows = Integer.parseInt(input.nextLine());

        System.out.println("enter number of columns: ");
        int columns = Integer.parseInt(input.nextLine());

        for (int i = 0; i < rows; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        drawStarsPiramid();
    }
}