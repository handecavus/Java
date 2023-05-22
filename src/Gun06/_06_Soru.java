package Gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {

        // Girilen bir ad soyadı örneğin "Hande Çavuş"
        // H.Ç. şeklinde yazdırınız.

        Scanner oku= new Scanner(System.in);

        System.out.print("Adınız ve Soyadınız=");
        String adSoyad= oku.nextLine(); // adSoyad veri olarak alındı

        // Hande Çavuş -> H.Ç. -> H -> charAt(0) H.
        // indexOf(" ") -> boşlupun indexini veriyor, bunun 1 fazlası charAt() -> Ç yi verir

        char ilkHarf= adSoyad.charAt(0); // H
        int boslukIndex= adSoyad.indexOf(" ");
        char soyadIlkHarf= adSoyad.charAt(boslukIndex+1); // Ç

        System.out.println(ilkHarf+"."+soyadIlkHarf+".");

        // char soyadIlkHarf= adSoyad.charAt(adSoyad.indexOf(" ")+1);
    }
}
