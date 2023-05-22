package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {

        //kullanıcının gireceği 2 sayının birbirine
        //eşit olup olmadığını yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("Birinci sayi=");
        int sayi1=oku.nextInt();

        System.out.print("İkinci sayi=");
        int sayi2=oku.nextInt();

        System.out.println("sayi1 sayi2 ye eşit mi? " + (sayi1==sayi2));

        //2.yöntem
        boolean esitMi=(sayi1==sayi2);
        System.out.println("esitMi = " + esitMi);

    }
}
