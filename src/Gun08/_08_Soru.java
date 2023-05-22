package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {

        //Girilen bir sayının tek sayı olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı=");
        int sayi= oku.nextInt();

        // 3 5 10000009 100003 tektir

        int kalan=sayi%2; // bu 1 e eşitse tektir

        System.out.println("tek mi? " + (kalan==1));

        //2.Yöntem
        System.out.println("tek mi? " + (sayi%2==1));

        //3.Yöntem
        System.out.println("tek mi? = " + (sayi%2!=0)); // negatif girilme ihtimali
        // sebebi ile bu en doğru, çünkü bir üstte negatif girilirse -1 gelir

    }
}
