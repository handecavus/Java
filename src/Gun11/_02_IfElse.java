package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {

        //Otopark ücretleri:
        //3 saate kadar 10tl, 5 saate kadar 15 tl, 5den büyükse 20 tl dir
        //kullanıcıdan kaç saat kaldığını alarak ücreti aldırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Otoparkta kaç saat kaldınız?=");
        int saat=oku.nextInt();

        if (saat <= 3) {
            System.out.println("10 ₺");
        }
        else {  //3den küçük değilse
            if (saat <= 5)
                System.out.println("15 ₺");
            else //5den küçük değilse
                System.out.println("20 ₺");
        }

        System.out.println((saat<=3)?"10₺" : (saat<=5)? "15₺" : "20₺");

    }
}
