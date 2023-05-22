package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan adını ve soyadını alarak ekrana yazdınız.

        Scanner okuyucu= new Scanner(System.in); // okuma işlemini yapacak olan değişken tanımlandı
        System.out.print("Adiniz ve soyadiniz="); //ekrana neyin girileceğini yazdık bilgilendirme
        String adSoyad=okuyucu.nextLine(); // okuma işlemi bu noktada yapılıyor

        System.out.println("adSoyad = " + adSoyad); // verinin gerçekten okunabildiğini
        // tekrar ekrana yazarak kontrol ettim
    }
}
