public class Ex7 {
    public static void main(String[] args) {
        int numar = 1;

        while (numar <= 20) {
            System.out.println(""+ numar + (numar++ % 2 == 0?" - Numarul este par.":" - Numarul este impar."));
//            if (numar % 2 == 0) {
//                System.out.println(numar + " - Numarul este par.");
//            } else {
//                System.out.println(numar + " - Numarul este impar.");
//            }
//            numar++;
        }
    }
}
