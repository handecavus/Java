package Gun29.soru;

public class Banka {
    // Hesap (yatan(int), cekilen(int), bakiye(int))
    // Musteri (musteriNo(int), ad, soyad, MusteriHesap(Hesap tipinde))
    // Bir banka uygulaması için 1 müşteri tanımlayınız,
    // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
    // Müşterinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
    // bakiyeye direkt para atanamadıgını kontrol ediniz.
    public static void main(String[] args) {

        Musteri mus1=new Musteri();
        mus1.musteriNo=1;
        mus1.ad="Burhan";
        mus1.soyad="Altıntop";

        mus1.musteriHesap.paraYatir(100);
        mus1.musteriHesap.paraYatir(200);
        mus1.musteriHesap.paraCek(50);

        System.out.println(mus1.musteriHesap);


    }
}
