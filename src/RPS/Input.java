package RPS;
import java.util.Scanner;

class Input {
    Scanner scanner = new Scanner(System.in);

    // Prints 's' and returns next user input
    public String nextLine(String s) {
        System.out.print(s);
        return scanner.nextLine();
    }
}