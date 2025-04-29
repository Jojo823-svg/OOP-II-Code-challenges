import java.util.Scanner;

public class PinCheck {
    int correctPin= 2025;
    int enteredPin;

    void checkPin() {
        if (enteredPin == correctPin) {
            System.out.println("Pin correct");
        } else {
            System.out.println("Incorrect Pin");
        }
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your PIN:");
        int correctPin= scanner.nextInt();
        PinCheck p= new PinCheck();
        p.checkPin();





    }
}
