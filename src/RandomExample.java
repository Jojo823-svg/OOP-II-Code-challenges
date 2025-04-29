import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        System.out.println("Random number: " + randomNumber);
    }
}
