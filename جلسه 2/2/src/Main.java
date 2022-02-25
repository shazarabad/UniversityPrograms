import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Math math = new Math();
        History history = new History();
        English english = new English();
        System.out.println("Enter math score: ");
        math.score = input.nextDouble();
        System.out.println("Enter math Factor: ");
        math.factor = input.nextDouble();

        System.out.println("Enter history score: ");
        history.score = input.nextDouble();
        System.out.println("Enter history Factor: ");
        history.factor = input.nextDouble();

        System.out.println("Enter english score: ");
        english.score = input.nextDouble();
        System.out.println("Enter english Factor: ");
        english.factor = input.nextDouble();

        double mathscore = math.Mathscore();
        double historyscore = history.Historyscore();
        double englishscore = english.Englishscore();


        double factors = english.factor + history.factor +math.factor;
        double result = (mathscore+historyscore+englishscore)/factors ;

        if (result < 10){
            System.out.println(" Not graduate ");
        }
        else{
            System.out.println("  graduate ");

        }



    }
}
