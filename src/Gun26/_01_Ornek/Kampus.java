package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {

        // Bir kampüs programı için aşağıdaki özellikte bilgilerin
        // kaydedileceği classları yazınız.
        // Okul: adı, mudurAdi, ucreti(double) ->tip
        // Ogrenci: okulNo, tamAd, okulu ->tip

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz
        // atayıp yazdırınız.

        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1;
        ogr.tamAd="Hande Çavuş";

        // 1.Yöntem
        ogr.okulu=new Okul();
        ogr.okulu.adi="Mehmet Akif Ersoy Okulu";
        ogr.okulu.mudurAdi="Çağla Çavuş";
        ogr.okulu.ucreti=50000;

        //2.Yöntem
        Okul ok=new Okul();
        ok.adi="Mehmet Akif Ersoy Okulu";
        ok.mudurAdi="Çağla Çavuş";
        ok.ucreti=50000;
        ogr.okulu=ok;

        System.out.println("okulNo = " + ogr.okulNo);
        System.out.println("tamAd = " + ogr.tamAd);
        System.out.println("okul ad = " + ogr.okulu.adi);
        System.out.println("mudurAdi = " + ogr.okulu.mudurAdi);
        System.out.println("ucreti = " + ogr.okulu.ucreti);



    }
}
