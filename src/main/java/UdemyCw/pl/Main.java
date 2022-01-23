package UdemyCw.pl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int array[];
        array = new int[8];
        System.out.println("długosc tablicy= " + array.length);
        System.out.println("wartosc 3 elemetu = " + array[2]);
        // poczatkowe wartosci tablicy
        long arrtab[];
        arrtab = new long[5];
        System.out.println(arrtab[4]);
        boolean flagArr[] = new boolean[6];
        System.out.println(flagArr[2]);
        String str[] = new String[7];
        System.out.println("6 element " + str[5]);
        int array1[] = {2, 3, 4, 5, 6, 77, 88};// deklaracja tablicy alokacji i incjalizacji
        System.out.println("długosc tablicy " + array1.length);
        System.out.println(array1[3]);
        System.out.println(Arrays.toString(array1));

        float arr1[] = {2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f};
        System.out.println(Arrays.toString(arr1));

        int[] Dane = new int[6];
        System.out.println(Dane.length);
        Dane[1] = 4;
        System.out.println(Dane[1]);
        Dane[0] = 2;

        //  1 2 3
        int wynik[][] = {{1, 2, 3},
                {5, 6, 7}};
        System.out.println(wynik[0][1]);//wartosc 2
        int wynik1[][] = new int[2][3];
        wynik1[1][1] = 7;
        System.out.println(wynik1[1][1]);//wartosc 7
        System.out.println(wynik1.length);
        int numRows =10;
        int numCols=15;
        int arr[][]= new int [numRows][numCols];
        System.out.println(arr);
        int[] tab12={1,2,34,5};
        int [][]tab33={{1,23,4},{3,5,6,}};
        System.out.println(tab12.length);
        System.out.println(tab33[0][1]);
        int [][]tab22={{1,23,4},{3,5,6,},{6,9,3}};
        System.out.println(tab22[2][2]);
        tab22[0][2]=100;
        System.out.println(tab22[0][2]);
        int[]tablica22={30,50,54,60,20};
                for(int i=0;i<tablica22.length;i++){
            System.out.println(tablica22[i]+",");
        }

        //enum
    }
}
