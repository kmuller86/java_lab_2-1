import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void Imie(String imie)
    {
        System.out.println(imie);
    }
    public static void Imie_Nazwisko(String imie, String nazwisko)
    {
        System.out.println(imie + nazwisko );
    }
    public static void Imie_Nazwisko_Wiek(String imie, String Nazwisko, int wiek)
    {
        System.out.println(imie + Nazwisko + wiek);
    }
    public static int Suma_2(int a, int b)
    {
       return a + b;
    }
    public static int Suma_3(int a, int b, int c)
    {
        return a + b + c;
    }

    public static void uzupelnij_tablice(int[] tab1)
    {
        for(int i = 0; i <= 20; i++ )
        {
            tab1[i] = 40 - i;
        }
    }
    public static void wypisz_tablice(int[] tab2)
    {
        for(int a: tab2 )
        {
            System.out.println(a);
        }
    }
     /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

    public static void uzupelnij_tablice2(String[] tab)
    {

        Scanner scan = new Scanner(System.in);
        for(int i =0; i<6; i++)
        {
            System.out.println("Napisz następne słowo");
            tab[i] = scan.next();
        }

    }
    public static void wypisz_tablice2 (String[] tab)
    {
        for(String a : tab)
        {
            System.out.println(a);
        }
    }



    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */
        int[] tab1 = new int[21];
        uzupelnij_tablice(tab1);
        wypisz_tablice(tab1);



        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */
        String[] string_tab = new String[6];
        uzupelnij_tablice2(string_tab);
        wypisz_tablice2(string_tab);



        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */
        Imie("Paulina");
        Imie_Nazwisko("Paulina  ", "Piotrowska");
        Imie_Nazwisko_Wiek("Paulina ","Piotrowska ", 26);

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */
        int zmiennaA = Suma_2(2,3);
        System.out.println("zmiennaA = " + zmiennaA);
        int zmiennaB = Suma_3(3,4,5);
        System.out.println("zmiennaB = " + zmiennaB);
        System.out.println("wynik = " + (Suma_2(2,3) + Suma_3(3,4,5)));


    }

}
