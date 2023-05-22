package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {

        // Kullanıcıdan 5 elemanlı diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız.

        Scanner oku=new Scanner(System.in);
        int dizi[]=new int[5];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(i+ ".Sayı giriniz:");
            dizi[i]= oku.nextInt();
        }
        System.out.println(Arrays.toString(dizi));

        enKucukYaz(dizi);
        enBuyukYaz(dizi);
        ortalamaYaz(dizi);

    }
    public static void enKucukYaz(int[] sayilar){
        int enKucuk=sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]<enKucuk){
                enKucuk=sayilar[i];
            }
        }
        System.out.println("enKucuk = " + enKucuk);
    }
    //public static void enKucukYaz(int[] sayilar){
    //    Arrays.sort(sayilar);
    //    System.out.println("enKucuk = " + sayilar[0]);
    //}

    public static void enBuyukYaz(int[] sayilar){
        int enBuyuk=sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]>enBuyuk){
                enBuyuk=sayilar[i];
            }
        }
        System.out.println("enBuyuk = " + enBuyuk);
    }
    //public static void enBuyukYaz(int[] sayilar){
    //    Arrays.sort(sayilar);
    //    System.out.println("enBuyuk = " + sayilar[sayilar.length-1]);
    //}
    public static void ortalamaYaz(int[] sayilar){
        int toplam=0;
        int ortalama=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam=toplam+sayilar[i];
            ortalama=toplam/ sayilar.length;
        }
        System.out.println("ortalama = " + ortalama);

    }
}
