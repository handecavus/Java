package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {

        // Kullanıcıdan ağırlığını double, boyunu double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazdırınız.
        // vucut kıtle ındexını de bularak yazdırınız  kg/ (boy*boy)

        Scanner oku= new Scanner(System.in);

        System.out.print("kilonuz=");
        double kilo= oku.nextDouble();

        System.out.print("boyunuz=");
        double boy= oku.nextDouble();

        double kitleIndex= kilo/(boy*boy);

        System.out.println("boyunuz="+boy+", kilonuz="+kilo);
        System.out.println("kitleIndex = " + kitleIndex);

    }
}
