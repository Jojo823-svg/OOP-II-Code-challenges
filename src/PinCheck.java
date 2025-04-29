import java.util.Scanner;

public class PinCheck {
    int correctPin = 2026;
    int enteredPin;

    void checkPin() {
        if (enteredPin == correctPin) {
            System.out.println("Pin correct");
        } else {
            System.out.println("Incorrect Pin");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your PIN:");
        int pin = scanner.nextInt();

        PinCheck p = new PinCheck();
        p.enteredPin = pin;
        p.checkPin();
    }
}
