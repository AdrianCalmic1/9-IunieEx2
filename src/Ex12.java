import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu varsta: ");
        int varsta = scanner.nextInt();

        if ( varsta <= 0 || varsta > 122 ) {
            System.out.println("Decedat");

        } else if ( varsta < 15 ) {
            System.out.println(" Copil ");

        } else if ( varsta < 18 ) {
            System.out.println(" Adolescent ");

        } else {
            System.out.println("Adult");
        }

    }
}
