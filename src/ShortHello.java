import java.util.*;

class ShortHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // set guard variable

        while ("y".equalsIgnoreCase(input)) { // check guard
            System.out.println("Hi!");
            input = sc.next(); // update guard
        }
    }
}
