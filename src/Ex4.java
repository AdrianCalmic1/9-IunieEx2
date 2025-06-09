import java.util.Scanner;
    public class Ex4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introdu primul numar: ");
            int numar1 = scanner.nextInt();

            System.out.print("Introdu al doilea numar: ");
            int numar2 = scanner.nextInt();

            if (numar1 > numar2) {
                System.out.println("Numarul mai mare este: " + numar1);
                System.out.println("Numarul mai mic este: " + numar2);
            } else if (numar2 > numar1) {
                System.out.println("Numarul mai mare este: " + numar2);
                System.out.println("Numarul mai mic este: " + numar1);
            } else {
                System.out.println("Numerele sunt egale.");
            }
        }
    }
