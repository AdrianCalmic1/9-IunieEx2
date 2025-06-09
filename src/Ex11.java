import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu un text: ");
        String text = scanner.nextLine();

        int lungime = text.length();

        if ( lungime > 0 ) {
            int indiceMaxim = lungime - 1;
            System.out.println(" Numarul total de caractere: " + lungime );
            System.out.println(" Indicele maxime: " + indiceMaxim);
        } else {
            System.out.println("Textul este gol.");
        }

    }
}
