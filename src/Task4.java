import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1=input.nextInt();
        System.out.println("Enter second number:");
        int num2=input.nextInt();
        int suma=num1+num2;
        System.out.println("The sum of these two is:"+suma);
        input.close();
    }
}
