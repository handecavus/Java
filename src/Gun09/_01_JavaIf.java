package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {

        //Baklava dilimimiz -> if
        //Girilen bir sayı 10 dan büyük ise ekrana 10 dan büyük yazdırınız.
        //Algoritma
        //1-Başla  {
        //2-Sayı oku sayi=oku.nextInt()
        //3-Sayı> 10 ise "10 dan büyük" yaz -> is(sayi>10) sout...
        //4-Dur

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayı Giriniz=");
        int sayi=oku.nextInt();

        if (sayi > 10) //normal parantezler şart, noktalı virgül yok
        {  //if şartı sağlandığında yapılacakların parantezi, birden fazla değilse parantez şart değil
            System.out.println("10 dan büyük");
            System.out.println("if içinde birden fazla komut var ise if parantezleri şarttır");
        }


    }
}
