package Gun17;

import java.util.Scanner;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {

        // Split: bir Stringi parçalara ayırmak demek

        // Kullanıcıdan alacağınız cümleyi kelimelerine göre alt alta yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle:");
        String cumle= oku.nextLine();

        String[] kelimeler=cumle.split(" ");

        for (int i = 0; i < kelimeler.length ; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }

    }
}
