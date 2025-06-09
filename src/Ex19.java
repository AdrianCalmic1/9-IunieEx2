import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Apasa o litera ( R, G, V ): ");
        String input = scanner.nextLine();//.toUpperCase(); // Pentru transformare in majuscula
        if(input.length()>1)
            System.out.println("Litera nu este gasita");
        else{
            switch(input){
                case "R","r":
                    System.out.println("Rosu");
                    break;
                case "G","g":
                    System.out.println("Galben");
                    break;
                case "V","v":
                    System.out.println("Verde");
                    break;
                default:
                    System.out.println("Litera nu este gasita");
            }
        }
        /*
        if (input.equals("R")) {
            System.out.println("Rosu");
        } else if (input.equals("G")) {
            System.out.println("Galben");
        } else if (input.equals("V")) {
            System.out.println("Verde");
        } else {
            System.out.println("Litera nu este gasita");
        }
        *?
         */
    }
}
