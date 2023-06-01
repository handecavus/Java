package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {

        Kisi kisi1=new Kisi();
//        kisi1.ad="hande";
//        kisi1.soyad="çavuş";
//        kisi1.yas=-25;
        kisi1.setAd("hande");
        kisi1.setSoyad("çavuş");
        kisi1.yasAta(-25);

        System.out.println(kisi1.yasVer());
        System.out.println(kisi1.getAd());
        System.out.println(kisi1.getSoyad());

        System.out.println("kisi1 = " + kisi1);

        //değişkene direkt erişimi kapatıp bir metod ile korumalı
        //veri gönderme ve alma işlemine Encapsulation denir


    }
}
