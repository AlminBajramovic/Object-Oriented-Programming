import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctAnswer = 66;
        while (true){
            System.out.println("Enter the number in range from 1 to 100");
            int playerGuess = Integer.parseInt(input.nextLine());

            if (playerGuess < 1 || playerGuess > 100){
                System.out.println("invalid guess");
                continue;
            }

            if (playerGuess == correctAnswer){
                System.out.println("you are correct");
                break;
            }
            else if(playerGuess < correctAnswer){
                System.out.println("Higher!");
            }
            else if(playerGuess > correctAnswer){
                System.out.println("Lower!");
            }
            else{
                System.out.println("invalid input, try again! ");
            }
        }
    }
}