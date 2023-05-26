package Gun24;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Soru {
    public static void main(String[] args) {

        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secenekte kelimenin kendisi ve manasını alınız
        // 2- Düzeltme (Bu secenekte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secenekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        Map<String,String> sozluk=new TreeMap<>();
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        int secim=0;

        do {
            //menü çıkacak (1- Ekleme, 2-Düzeltme, 3-Listeleme, 4-Arama)
            System.out.print("MENÜ\n1-EKLEME\n2-Düzeltme\n3-Listeleme\n4-Arama\n5-Silme\n6-Çıkış\nSeçiminiz:");
            //seçim alınacak
            secim= okuInt.nextInt();
            //seçime göre işlem yapılacak
            switch (secim){
                case 1: //1i seçti ekleme işlemini yap
                    //kelimeyi giriniz
                    System.out.print("Kelime giriniz:");
                    String kelime=okuStr.nextLine();
                    //manasını giriniz
                    System.out.print("Manasını giriniz:");
                    String mansi=okuStr.nextLine();
                    //buna uygun değişken ekle
                    sozluk.put(kelime,mansi);
                    break;
                case 2: //2yi seçti düzeltme işlemini yap
                    System.out.println("düzeltme seçildi");break;
            }

        }while (secim!=6); //çıkış olmadığı sürece devam et

    }
}
