package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {

        // Girilen bir sayının, 2 aynı sayının çarpımına eşit olup olmadığını bulunuz.
        // 4 girdim -> 2*2 bu tam karedir.
        // 5 girdim -> değildir.
        // 9 girdim -> 3*3 tam kare

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int sayi= oku.nextInt();

        // 5 girildi, 5e kadar sayıları 1,2,3,4 birbiriyle çarparım
        // 9 girildi, 9a kadar sayıları 1,2,3,4,5,6,7,8,9

        int sayac=0; // 4 girdi
        int arananRakam=0;
        while (sayac < sayi) {
            System.out.println("sayac = " + sayac);
            if (sayac*sayac==sayi){ // 0*0==4, 1*1==4, 2*2==4
                System.out.println("tam karedir");
                arananRakam=sayac;
                break; //çalıştığında döngüden çıkar
            }
            sayac++;
        }
        if (arananRakam==0)
            System.out.println("tam kare değildir");

        //2.Yöntem
        boolean tamKare=false;
        while (sayac < sayi) {
            System.out.println("sayac = " + sayac);
            if (sayac*sayac==sayi) {
                tamKare=true;
                System.out.print("tam karedir");
                break;
            }
            sayac++;
        }
        if (tamKare==false)
            System.out.println("tam kare değildir");

    }
}
