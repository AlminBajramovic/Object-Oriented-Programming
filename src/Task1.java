/*import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String pass="Almin";
        String guess="";
        while(!guess.equals(pass)){
            System.out.print("Enter a pass: ");
            guess= input.nextLine();
        }
        System.out.println("Correct!");
        System.out.println("Secret message:Good");
        input.close();
    }
}*/



import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String pass="Almin";
        String guess;
        do {
            System.out.print("Enter a password: ");
            guess= input.nextLine();
            if (guess.equals(pass)){System.out.println("Correct!");
                System.out.println("Secret message:Good");}
            else {
                System.out.print("Wrong! Try again: ");
            }
        }while (!guess.equals(pass));
    input.close();
    }
}
