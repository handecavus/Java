package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {

        //Girilen vize (%50) ve final (%50) notunu okuyarak ortalamayı bulunuz
        //ortalama 60dan büyük eşit ise geçtiniz, tebrikler yazdırınız, değilse
        //bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Vize:");
        double vizeNot=oku.nextDouble();
        System.out.print("Final:");
        double finalNot=oku.nextDouble();

        double notOrt=(double)(vizeNot+finalNot)/2;

        if (notOrt >= 60) {
            System.out.println("Geçtiniz, tebrikler");
        }
        else {
            System.out.println("Bütünlemeye kaldınız");
        }

        //Süslü parantez kuralı: sadece 1 satır (;) çalışacak ise zorunlu değil
        //birden fazla ise zorunlu, her zaman koyulabilir, hiçbir mahsuru yok


    }
}
