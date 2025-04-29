import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {

        Random rand = new Random();


        int diceRoll = rand.nextInt(6) + 1;

        String rollMessage;

        if (diceRoll == 1) {
            rollMessage = "You rolled the lowest number.";
        } else if (diceRoll == 6) {
            rollMessage = "Congratulations! You rolled the highest number.";
        } else {
            rollMessage = "Nice roll!";
        }

        System.out.println("You rolled: " + diceRoll);
        System.out.println(rollMessage);
    }
}

