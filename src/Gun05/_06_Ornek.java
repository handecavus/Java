package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        // Bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+a+a+a     alan=a*a

        Scanner oku=new Scanner(System.in);

        System.out.print("karenin bir kenar uzunlugu=");
        int kenar= oku.nextInt();

        int cevre= kenar+kenar+kenar+kenar;  // 4*kenar
        System.out.println("cevre = " + cevre);

        int alan= kenar*kenar;
        System.out.println("alan = " + alan);
    }
}
