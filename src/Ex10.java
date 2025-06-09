import java.util.Scanner;

    public class Ex10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introdu un text: ");
            String text = scanner.nextLine();

            String textMajuscule = text.toUpperCase();

            System.out.println("Textul in majuscule este: " + textMajuscule);
        }
    }

