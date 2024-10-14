package Lab1;

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=input.nextInt();
        System.out.print("Enter second number: ");
        int num2=input.nextInt();
        if(num1>num2){
            System.out.print("The greater number is: "+num1);
        } else if (num1<num2) {
            System.out.print("The greater number is: "+num2);
        }
        else {
            System.out.print("They are equal!");
        }
        input.close();
    }
}
