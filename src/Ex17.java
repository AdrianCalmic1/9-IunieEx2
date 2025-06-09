public class Ex17 {
        public static void main(String[] args) {
            int[] numere = {3, 7, 2, 9, 5};

            int max = numere[0];

            for (int numar : numere) {
                if (numar > max) {
                    max = numar;
                }
            }

            System.out.println("Cel mai mare numar este: " + max);
        }
    }

