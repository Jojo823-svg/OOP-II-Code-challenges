public class PINBooleanChallenge {
    int correctPin= 2025;
    int enteredPin=1978;

    void checkPin() {
        if (enteredPin == correctPin) {
            System.out.println("Correct Pin.");
        } else {
            System.out.println("Incorrect Pin.");
        }
    }
    public static void main(String[]args){
            new PINBooleanChallenge().checkPin();

        }
    }

