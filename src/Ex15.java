import java.util.Arrays;

public class Ex15 {
    public static void main(String[] args) {
            byte [] numere = { 10, 20, 30, 40, 50 };

        //Array original !
        System.out.println("Array original: " + Arrays.toString(numere));

        numere[4] = 99;
        //Array modificat !
        System.out.println("Array dupa modificare: " +  Arrays.toString(numere));

    }
}
