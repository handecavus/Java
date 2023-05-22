package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {

        //Kullanıcının 2 kez gireceği şifresinin aynı olduğunu
        //AYNI veya DEĞİL şeklinde cevaplayınız. (confirm new password)

        Scanner oku=new Scanner(System.in);

        System.out.print("Şifre giriniz=");
        String sifre1=oku.nextLine();

        System.out.print("Tekrar şifre giriniz=");
        String sifre2=oku.nextLine();

        if (sifre1.equals(sifre2))
            System.out.println("AYNI");

        if (!sifre1.equals(sifre2))
            System.out.println("DEĞİL");

        //2.Yöntem
        boolean ayniMi=sifre1.equals(sifre2);
        if (ayniMi == true)
            System.out.println("AYNI");
        if (ayniMi== false)
            System.out.println("DEĞİL");






    }
}
