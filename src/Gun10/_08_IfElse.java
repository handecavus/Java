package Gun10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {

        //Yan yana aralarında bir boşlukla girilen 3 int sayının
        //toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        //45 67 123

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayıları boşluk bırakarak giriniz:");
        String sayilar=oku.nextLine();

        int bosInd=sayilar.indexOf(" ");
        String strSayi1=sayilar.substring(0,bosInd);
        int bosInd2=sayilar.lastIndexOf(" ");
        String strSayi2=sayilar.substring(bosInd+1,bosInd2);
        String strSayi3=sayilar.substring(bosInd2+1);

        int sayi1=Integer.parseInt(strSayi1);
        int sayi2=Integer.parseInt(strSayi2);
        int sayi3=Integer.parseInt(strSayi3);

        int toplam=sayi1+sayi2+sayi3;

        if (toplam%2==0) {
            System.out.println("Çift");
        }
        else{
            System.out.println("Tek");
        }

        //2.Yöntem

        // int bos1Ind=sayilar.indexOf(" ");
        // int bos2Ind=sayilar.lastIndexOf(" ");
        // int bos2Ind2=sayilar.indexOf(" ",bos1Ind+1); //2.boşluğu aramaya verilen yerden sonra başla


        // int sayi1=Integer.parseInt(sayilar.substring(0,bos1Ind));
        // int sayi2=Integer.parseInt(sayilar.substring(bos1Ind+1, bos2Ind));
        // int sayi3=Integer.parseInt(sayilar.substring(bos2Ind+1));

        //if ((sayi1+sayi2+sayi3)%2 == 0)
        //    System.out.println("Çift");

        // else
        //    System.out.println("Tek");

    }
}
