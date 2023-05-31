package Gun30._02_FinalVariables.Ornek2;

import java.util.Scanner;

public class Soru {
    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan gun, saat, dakika alarak toplam
    // saniyeyi bulunuz.
    public static void main(String[] args) {

        //1.Yöntem
        int gun;
        int saat;
        int dakika;

        Scanner scan=new Scanner(System.in);
        System.out.print("Gün giriniz:"); gun= scan.nextInt();
        System.out.print("Saat giriniz:"); saat= scan.nextInt();
        System.out.print("Dakika giriniz:"); dakika= scan.nextInt();

        int toplamSaniye= (gun*Sabitler.gunSaat*Sabitler.saatDk*Sabitler.dkSaniye)+
                          (saat*Sabitler.saatDk*Sabitler.dkSaniye)+
                          (dakika*Sabitler.dkSaniye);
        System.out.println("toplamSaniye = " + toplamSaniye);

        //2.Yöntem
        System.out.println("toplamSaniye = " + Sabitler.hesapla(gun,saat,dakika));
    }
}

