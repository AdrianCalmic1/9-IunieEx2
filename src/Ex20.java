import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar intreg: ");

        int numar = scanner.nextInt();

        int dublu = numar * 2;

        System.out.println("Dublu numarului este: " + dublu);
    }
}
