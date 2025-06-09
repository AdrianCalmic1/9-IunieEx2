public class Ex14 {
    public static void main(String[] args) {
        System.out.println("Eu numar pana la 20 si tot ma opresc la 14, dar voi lua o gustare si imi voi continua drumul.");

        for (int i = 1; i <= 20; i++) {
            if (i != 14) {
                System.out.println(i);
                //continue; // voi sare peste 14
            }
            System.out.println(i);
        }
    }
}
