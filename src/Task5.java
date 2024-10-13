import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numb=num.nextInt();
        if(numb>0){
            System.out.println("It is positive!");
        }
        else{
            System.out.println("It is negative!");
        }
        num.close();
    }
}
