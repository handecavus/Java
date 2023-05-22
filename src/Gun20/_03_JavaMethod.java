package Gun20;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {

        // Kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöriyel)
        // bir fonksiyonda buldurup, bunun sonucunu mainde tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int sayi= oku.nextInt();

        int carpim=faktoriyel(sayi);
        System.out.println("carpim = " + carpim);

        if (carpim%2==0){
            System.out.println("çift");
        }
        else {
            System.out.println("tek");
        }


    }
    public static int faktoriyel(int sayi){
        int carpim=1;
        for (int i = 1; i < sayi; i++) {
            carpim=carpim*i;
        }
       return carpim;
    }

}
