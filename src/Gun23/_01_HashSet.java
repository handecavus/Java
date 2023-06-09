package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

        int sayi=5; // hafızada 1 sayı saklıyor
        int[] dizi=new int[6]; // hafızada 6 sayı saklar: sabit boyutlu
        int[][] tablo=new int[3][20]; //hafızada 60 sayı saklıyor, 3x20 şeklinde

        //dizi lazım, ama boyutu ekledikçe artsın, sildikçe azalsın
        ArrayList<Integer> liste=new ArrayList<>(); //boyu değişken
        ArrayList< ArrayList<Integer> > listelerinListesi=new ArrayList<>(); //2 boyutlu, 2 boyutuda değişken

        /************************************************************************************/

        //HashSet-> sen ekledikçe hızlı çalışmak için kendine göre bir sıralamada elemanları tutar.
        //LinkedHashSet-> sen ekledikçe, EKLENME SIRASINA göre, elemanlarını saklar.
        //TreeSet-> sen ekledikçe onları her zaman SIRALI tutar dedi.
        //bunların ortak özelliği hiç TEKRAR değer bulundurmaz.

        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        boolean eklendiMi      =hs1.add(5); //true
        boolean tekrarEklendiMi=hs1.add(5); //false
        hs1.add(2);

        System.out.println("eklendiMi = " + eklendiMi);
        System.out.println("tekrarEklendiMi = " + tekrarEklendiMi);
        System.out.println("hs1 = " + hs1);





    }
}
