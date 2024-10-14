import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter the nth number to calculate the number to that power: ");
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        int result = (int)  Math.pow(n, 2);
        System.out.println(result);

    }
}