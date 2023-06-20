package Gun41;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _06_Duration {
    public static void main(String[] args) {
        //Duration: Hem LocalTime hemde LocalDateTime arasındaki farkı verir

        //LocalTime
        LocalTime dersBaslangic=LocalTime.of(19,0,0);
        LocalTime dersBitis=LocalTime.of(22,0,0);

        Duration gunlukDersSuresi=Duration.between(dersBaslangic,dersBitis);
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi);

        System.out.println("toHours() = " + gunlukDersSuresi.toHours()); //farkın toplam saat hali
        System.out.println("toMinutes() = " + gunlukDersSuresi.toMinutes()); //farkın toplam dakika hali
        System.out.println("toMillis() = " + gunlukDersSuresi.toMillis()); //farkın toplam milisaniye hali

        //LocalDateTime *** 2 tarih-saat arasındaki fark ***
        LocalDateTime from=LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to=LocalDateTime.now(); //bugün

        Duration farkZaman=Duration.between(from,to);
        System.out.println("farkZaman = " + farkZaman);
        System.out.println("farkZaman.toDays() = " + farkZaman.toDays()); //farkın toplam günü
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours()); //farkın toplam saati
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes()); //farkın toplam dakikası







    }
}