import java.util.Scanner;
public class Task6 {
    static void printText(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how much times you want to display the text: ");
        int n = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= n; i++){
            System.out.println(" the beginning there were the swamp, the hoe and Java.");
        }
    }

    public static void main(String[] args){
        printText();
    }
}