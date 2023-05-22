package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {

        //Girilen iki sayıdan büyük olanının değerini ekrana yazdırınız,
        //eşit ise eşit yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Sayı 1=");
        int sayi1=oku.nextInt();

        System.out.print("Sayı 2=");
        int sayi2=oku.nextInt();

        if (sayi1 < sayi2) //buradaki normal parantezler şart,opsiyonel olan süslü{ parantezdir
            System.out.println("Sayı2 büyük"+sayi2);

        if (sayi1 == sayi2)
            System.out.println("Sayı1 Sayı2 eşittir");

        if (sayi1 > sayi2) {
            System.out.println("Sayı1 büyük" + sayi1);
            System.out.println("sayi1 = " + sayi1);
        }
    }
}
