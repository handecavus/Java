package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        // Girilen bir adı ekrana yazdınız.
        Scanner okuyucu=new Scanner(System.in);

        System.out.print("adınızı giriniz=");
        String ad=okuyucu.next(); // next() bir kelime okur.

        System.out.println("ad = " + ad);

        /*
        okuyucu.next(); -> bir kelime okur
        okuyucu.nextLine(); -> satırın tümünü okur

        okuyucu.nextInt(); -> int değeri okumak için
        okuyucu.nextShort(); -> short değeri okumak için
        okuyucu.nextByte(); -> byte değeri okumak için
        okuyucu.nextLong(); -> long değeri okumak için

        okuyucu.nextFloat(); -> float değeri okumak için
        okuyucu.nextDouble(); -> double değeri okumak için

        okuyucu.nextBoolen(); -> true veya false girişi için
        */
    }
}
