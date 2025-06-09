import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu primul numar: ");
        int numar1 = scanner.nextInt();

        System.out.print("Introdu al doilea numar: ");
        int numar2 = scanner.nextInt();

        int Adunarea = numar1 + numar2;
        int Scaderea = numar1 - numar2;
        int Inmultirea = numar1 * numar2;

        double Impartirea = (double) numar1 / numar2;
        int Rest = numar1 % numar2;

        System.out.println("Adunarea:  " + Adunarea);
        System.out.println("Scaderea:  " + Scaderea);
        System.out.println("Inmultirea:" + Inmultirea);
        System.out.println("Impartirea:" + Impartirea);
        System.out.println("Rest impartirii: " + Rest);


    }
}
