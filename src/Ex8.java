import java.util.Scanner;

    public class Ex8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introdu ora (0-23): ");
            int ora = scanner.nextInt();
            String message = "";
            if (ora < 0 || ora > 23) {
                message ="Ora invalida. Te rog introdu o ora intre 0 si 23.";
            } else if (ora >= 5 & ora < 12) {
                message ="Este dimineata.";
            } else if (ora >= 12 & ora < 17) {
                System.out.println("Este dupa amiaza.");
            } else if (ora >= 17 & ora < 21) {
                System.out.println("Este seara.");
            } else {
                System.out.println("Este noapte.");
            }
            System.out.println(message);
        }
    }


