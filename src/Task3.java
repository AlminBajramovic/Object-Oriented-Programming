import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1;
        int suma=0;
        do {
            System.out.print("Enter a number: ");
            num1= input.nextInt();
            if (num1!=0){
                suma+=num1;
            }
        } while (num1!=0);
        System.out.print("The sum of the numbers is: "+suma);
        input.close();
    }
}
