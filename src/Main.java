public class Main {

    public static void main(String[] args) {
        {
            //zad 1
            int i = 1000;

            do {
                if (i % 87 == 0)
                    System.out.println("Liczba " + i + " jest podzielna przez 87");
            }
            while (--i > 0);
        }
        //zad 2

        int[] tab1 = new int[5];
        tab1[0] = 5;
        tab1[1] = 56;
        tab1[2] = 12;
        tab1[3] = 67;
        tab1[4] = 11;

        int j = 0;

        while (j < tab1.length) {
            System.out.println(tab1[j++] + " ");
        }

        double[] tab2 = new double[5];
        tab2[0] = 5.78;
        tab2[1] = 56.9;
        tab2[2] = 12.21;
        tab2[3] = 67.8656;
        tab2[4] = 11.1;

        int k = 0;

        while (k < tab1.length) {
            System.out.println(tab2[k++] + " ");
        }

        //zad3

    }

}
