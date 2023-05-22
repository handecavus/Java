package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {

        // Bir dikdörtgenin gerekli kenar uzunluklarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+b+a+b    alan=a*b

        Scanner oku=new Scanner(System.in);

        System.out.print("kisakenar=");
        int kisaKenar=oku.nextInt();

        System.out.print("uzunkenar=");
        int uzunKenar= oku.nextInt();

        int cevre = (kisaKenar+uzunKenar)*2;
        System.out.println("cevre = " + cevre);

        int alan = kisaKenar*uzunKenar;
        System.out.println("alan = " + alan);
    }
}
