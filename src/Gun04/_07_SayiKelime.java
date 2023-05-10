package Gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {

        String ad= "hande";
        String kelimeSayi= "65";  // string halde, toplama gibi bir işleme giremez.

        int sayiDeger= Integer.parseInt(kelimeSayi); // sayiya dönüştürür

        int toplam= sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);

        // toplam şuanda int yani sayi, bunu String nasıl dönüştürürüm
        String strToplam= Integer.toString(toplam); // String e dönüştürür
        System.out.println("strToplam = " + strToplam);




    }
}
