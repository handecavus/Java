package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {

        //LocalDate sadece gün ay yıl bilgisini tutar.

        LocalDate tarih=LocalDate.now(); //şuan ki zamanı verdi
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        System.out.println();

        //kendisindeki hazır formatlara bakalım
        System.out.println("ISO_DATE = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT    = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM   = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG     = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL     = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("\n****************");
        //Localde aldığım tarihi istediğim ülkenin formatına göre, diline göre nasıl gösteririm?
        //Örneğin localdeki saati Almanya'ya nasıl gösteririz?

        System.out.println("FULL Almanya Gösterimi =\n" +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));

        System.out.println();

        //Lokalizasyon tanımlaması
        //en-US: birincisi DİLİ, ikisincisi ÜLKEYİ temsil ediyor. USA İngilizcesi
        //en-UK: UK ingilizcesi
        //fr-CA: CA fransızcası
        //en-CA: CA ingilizcesi

        Locale[] kullanilabilirLokaller=Locale.getAvailableLocales();

        for (Locale l:kullanilabilirLokaller){
            if (l.getDisplayCountry().toLowerCase().contains("chi")) {
                System.out.print("Dil = " + l.getDisplayLanguage());
                System.out.print(", Ülke = " + l.getDisplayCountry());
                System.out.print(",   " + l.getLanguage());
                System.out.println(", -  " + l.getCountry());
            }
        }

        System.out.println();

        Locale localeCince=new Locale("zh","CN");
        System.out.println("FULL Çince Gösterimi =\n" +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localeCince)));

        System.out.println("\n*********** İstediğim Formatta Göstrim ***********");
        //istedğim formatta gösterim
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println("tarih dd/MM/yyy = " + tarih.format(ozelFormat1));

        DateTimeFormatter oz2=DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih d.M.yy = " + tarih.format(oz2));

        DateTimeFormatter oz3=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarih EEEE dd.MM.yyyy = " + tarih.format(oz3));

        DateTimeFormatter oz4=DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarih EEEE dd.MM.yyyy = " + tarih.format(oz4));

        System.out.println("özel format ve loc EEEE dd.MM.yyyy = " + tarih.format(oz3.withLocale(Locale.UK)));

        DateTimeFormatter oz5=DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");
        System.out.println("tarih MMMM dd.MM.yyyy = " + tarih.format(oz5));

        System.out.println("\n****************");
        //Kendimiz bir tarihi nasıl set edebiliriz, oluşturabiliriz, int sayi=5

        LocalDate tarih1=LocalDate.of(2000,5,20);
        LocalDate tarih2=LocalDate.of(1997, Month.MARCH, 8);
        System.out.println("tarih2.format(ozelFormat1) = " + tarih2.format(ozelFormat1));


    }
}
