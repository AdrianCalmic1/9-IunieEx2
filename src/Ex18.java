public class Ex18 {
        public static void main(String[] args) {
            int[] numere = {3, 7, 2, 9, 5};

            int max = numere[0];

            for (int numar2 : numere) {
                if (numar2 < max) {
                    max = numar2;
                }
            }

            System.out.println("Cel mai mic numar este: " + max);
        }
    }

