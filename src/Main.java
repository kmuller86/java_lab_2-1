import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
        /* Hmmm takie rozwiązanie widziałem w kilku pracach już ... */
        ArrayList<String> Animals = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 5 zwierząt");
        for(int i = 0; i<5; i++)
        {
            String imput1 = scan.next();
            Animals.add(imput1);
        }


        for (String a : Animals)
        {
            System.out.print(a + ", ");
        }

        Animals.remove(4);
        Animals.remove(3);

        System.out.println();

        Animals.add("chomik");
        Animals.add("wróbel");
        Animals.add("antylopa");

        for (String a : Animals)
        {
            System.out.print(a + ", ");
        }
        System.out.println();

        System.out.println("Wielkość listy " + Animals.size());

        Collections.sort(Animals, Collections.reverseOrder());

        System.out.println();

        for (String a : Animals)
        {
            System.out.print(a + ", ");
        }
        System.out.println();







         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        Set<Integer> Liczby = new HashSet<>();

        Scanner scan2 = new Scanner(System.in);

        System.out.println("Podaj 10 liczb");

        for(int i = 0; i<10; i++)
        {
            int imput2 = scan.nextInt();
            Liczby.add(imput2);
        }


        for (int b : Liczby)
        {
            System.out.print(b + ", ");
        }
        System.out.println();





    }

}
