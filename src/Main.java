public class Main {

    public static void main(String[] args) {

        /* cw.4  */


        /* przykład użycia break */

        for (int i = 0; i < 99; i++) {
            if (i == 89)
                break;
            System.out.print(i + " ");
        }

        System.out.println("\n");

        /* przykład użycia continue */

        for (int i = 0; i <= 100; i++) {
            if (i >=34)
                continue;
            System.out.print(i + " ");
        }

        System.out.println("\n");

        /* przykład użycia return */

        for (int i = 0; i <= 100; i++) {
            if (i == 12)
                return;
            System.out.print(i + " ");
        }
    }
}
