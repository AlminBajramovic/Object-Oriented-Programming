import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Enter first Number: ");
        num1= input.nextInt();
        System.out.println("Enter second Number: ");
        num2= input.nextInt();
        if (num1>num2){
            System.out.print("First number should not me biger then the second number!");
        }
        else {
            int currentNumber=num1+1;
            while (currentNumber<num2){
                System.out.println(currentNumber);
                currentNumber++;
            }
            input.close();
        }
    }
}
