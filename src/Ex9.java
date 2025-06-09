import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu numarul lunii (1-12): ");
        int luna = scanner.nextInt();

        String anotimp;

        switch (luna) {
            case 12:
            case 1:
            case 2:
                anotimp = "iarna";
                break;
            case 3:
            case 4:
            case 5:
                anotimp = "primavara";
                break;
            case 6:
            case 7:
            case 8:
                anotimp = "vara";
                break;
            case 9:
            case 10:
            case 11:
                anotimp = "toamna";
                break;
            default:
                anotimp = "luna invalida";
        }

        System.out.println("Anotimpul este: " + anotimp);
    }
}
