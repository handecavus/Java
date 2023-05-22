package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {

        //Girilen bir sayının tek mi çift mi olduğunu yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();

        //int kalan=sayi%2

        if (sayi%2 != 0)  //1 veya -1 sayi%2==1 yazabilirdik ama 0 ı katmak için böyle yazdık
            System.out.println("Tek");

        if (sayi%2 == 0)
            System.out.println("Çift");

    }
}
