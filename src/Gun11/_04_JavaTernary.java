package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {

        //Soru: Girilen sayı 50den büyük ise 1, değilse 0 değerini
        //ekrana yazdırınız. Ternarry operatör ile yapınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi= oku.nextInt();

        String sonuc= (sayi > 50) ? "1" : "0";
        System.out.println("sonuc = " + sonuc);

        //2.Yöntem

        System.out.println((sayi > 50) ? "1" : "0");



    }
}
